abstract class BaseWithPrint{
	public BaseWithPrint(){
		print();
	}//基类的构造器中调用这个方法
	public abstract void print();	//创建一个基类，包含抽象方法print（）
}
class DerivedWithPrint extends BaseWithPrint{
	int i = 47;
	public void print(){ //导出类中覆盖print（）方法，覆盖的方法版本可以打印导出类中定义的某个整形变量的值
		System.out.println("i = " + i);
	}
}
public class Initialization{
	public static void main(String [] args){
		DerivedWithPrint dp = new DerivedWithPrint(); //创建一个导出类对象，然后调用他的print（）方法
		dp.print();
	}
}
