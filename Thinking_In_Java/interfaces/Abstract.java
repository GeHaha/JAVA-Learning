//����һ�����࣬�������������󷽷��ĳ����࣬����֤���ǲ���Ϊ���ഴ���κ�ʵ��

abstract class NoAbstractMethods{
	void f(){
		System.out.println("f()");
	}
public class Abstract{
	public static void main(String [] args){
		new NoAbstractMethods();
	}
}
