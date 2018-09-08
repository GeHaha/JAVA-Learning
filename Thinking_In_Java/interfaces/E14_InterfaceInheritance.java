interface Interface1 {
	
	void f1();
	void g1();
}
interface Interface2 {
	void f2();
	void g2();	
}
interface Interface3 {
	void f3();
	void g3();
}
//继承出一个接口，它组合了这三个接口并添加了一个新方法
interface Multiple extends Interface1,Interface2,Interface3{
	void h();
}
//创建一个实现了该接口并且继承了某个具体类的类
//具体的类
class Concrete{
	String s;
	public Concrete(String s){
		this.s = s;
	}
}
//实现该接口并且继承了具体的类
class All extends Concrete implements Multiple{
	All(){
		super("All");
	}
	public void h(){
		System.out.println("All.h");
	}
	public void f1(){
		System.out.println(All.f1);
	}
	public void g1(){
		System.out.println(All.g1);
	}
	public void f2(){
		System.out.println(All.f2);
	}
	public void g2(){
		System.out.println(All.f3);
	}
	public void f3(){
		System.out.println(All.f3);
	}
	public void g3(){
		System.out.println(All.g3);
	}
}
//编写四个方法，每个都接受这四个接口之一作为参数
//在mian（）方法中，创建这个类的对象，并将其传递给这四个方法
public class E14_InterfaceInheritance{
	static void takes1(Interface1 i){
		i.f1();
		i.g1();
	}
	static void takes2(Interface2 i){
		i.f2();
		i.g2();
	}
	static void takes3(Interface3 i){
		i.f3();
		i.g3();
	}
	static void takesAll(All a){
		a.f1();
		a.g1();
		a.f2();
		a.g2();
		a.f3();
		a.g3();
		a.h();
	}
	public static void main(String  args[]){
		All a = new All(); //创建对象
		takes1(a);  //传递给这四个方法
		takes2(a);
		takes3(a);
		takesAll(a);
	}
}


	
	