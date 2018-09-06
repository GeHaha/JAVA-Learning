class Shared{
	private int refcount = 0;
	private static long counter = 0; //跟踪创建的	Shared的实例对象的数量，还可以为id提供数值
	//counter的类型是long而不是int，以防止溢出
	private final long id = counter++;
	//id是final，因为不想值被改变
	public Shared(){
		System.out.println("Creating" + this);
	}

	public void addRef(){
	refcount++;
	}
	protected void dispose(){
	if(--refcount == 0)
		System.out.println("Disposing" + this);
	}
	public String toString(){
	return "Shared" + id ;
	}
}
class Composing{
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared){
		System.out.println("Creating" + this );

		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose(){
		System.out.println("Disposing" + this);
		shared.dispose();
	}
	public String toString(){
		return "Composing" + id ;
	}
}

public class ReferenceCounting{
	public static void main(String [] args){
		Shared shared = new Shared();
		Composing[] composing = {new Composing(shared), 
			new Composing(shared),new Composing(shared),
			new Composing(shared),new Composing(shared)};

		for(Composing c :composing)
			c.dispose();
	}
}
