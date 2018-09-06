//创建一个基类，让它不包含抽象方法的抽象类，并验证我们不能为该类创建任何实例

abstract class NoAbstractMethods{
	void f(){
		System.out.println("f()");
	}
public class Abstract{
	public static void main(String [] args){
		new NoAbstractMethods();
	}
}
