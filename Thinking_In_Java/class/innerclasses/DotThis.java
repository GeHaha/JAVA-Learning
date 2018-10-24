public class DotThis{
	void f(){
		System.out.println("DotThis.f()");
	}
	
	public class Inner{
		public DotThis outer(){
			return DotThis.this;
		}
	}

	public Inner inner(){
	 
	 return new Inner();
	}
	public static void main(String[] args){
		DotThis dt = new DotThis(); 
		DotThis.Inner dti = dt.inner();
		// 要想直接创建内部类的对象，必须使用外部类的对象来创建该
		//内部类的对象
		dti.outer().f();
		}
	
}
