class A{
	public A(){//�Զ��幹����A
		System.out.println("A()");
	}
}
class B{
	public B(){
		System.out.println("B()");//������������Ĭ�Ϲ�����A�͹�����B
	}
}
class C extends A{
	B b = new B();//��A�м̳в���һ����ΪC�����࣬��c�ڴ���һ��B��ĳ�Ա����Ҫ��C��д������
	}

public class E05_SimpleInheritance{
	public static void main(String [] args){
		new C();//����һ��C�����
	}
}
/*
public class Person{

	public 	String name;
	public int age;

// �Զ��幹����
	public Person (String name,int age){
		this.name = name ;
		this.age = age;
}
	public static void main(String [] args){
		
// ʹ���Զ���Ĺ������������󣨹������Ǵ����������Ҫ;����
		Person p = new Person("С��",21);
		System.out.println(p.age);
		System.out.println(p.name);
}
}

*/










