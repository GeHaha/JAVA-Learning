class A{
	public A(){//自定义构造器A
		System.out.println("A()");
	}
}
class B{
	public B(){
		System.out.println("B()");//创建两个带有默认构造器A和构造器B
	}
}
class C extends A{
	B b = new B();//从A中继承产生一个名为C的新类，在c内创建一个B类的成员，不要给C编写构造器
	}

public class E05_SimpleInheritance{
	public static void main(String [] args){
		new C();//创建一个C类对象
	}
}
/*
public class Person{

	public 	String name;
	public int age;

// 自定义构造器
	public Person (String name,int age){
		this.name = name ;
		this.age = age;
}
	public static void main(String [] args){
		
// 使用自定义的构造器创建对象（构造器是创建对象的重要途径）
		Person p = new Person("小明",21);
		System.out.println(p.age);
		System.out.println(p.name);
}
}

*/










