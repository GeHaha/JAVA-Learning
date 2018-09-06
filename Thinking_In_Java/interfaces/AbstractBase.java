
//创建一个不包含任何方法的抽象类，从他哪里导出一个类，并添加一个方法，创建一个静态方法，他可以接受
//指向基类的引用，将其向下转型导出类，然后再调用该静态方法。
//在main（）中，展现他的运行情况，然后，为基类中的方法加上abstract声明，这样不需要向下转型。



abstract class NoMethods{}
//不包含任何方法的抽象类
class Extend1 extends NoMethods{
	public void f(){
		System.out.println("Extended1.f");
	}//导出一个类，并添加方法
}
abstract class WithMethods{
	abstract public void f();
}
class Extended2 extends WithMethods{
	public void f(){
		System.out.println("Extended2.f");
	}
}
public class AbstractBase{
	public static void test1(NoMethods nm){ 
		((Extend1)nm).f();
	}
	public static void test2(WithMethods wm){//创建一个静态方法，他可以接受指向基类的引用，将其向下转型导出类，然后再调用该静态方法。
		wm.f();
	}
	public static void main(String [] args){
		NoMethods nm =  new Extend1();
		test1(nm);
		WithMethods wm = new Extended2();
		test2(wm);
	}
}




















