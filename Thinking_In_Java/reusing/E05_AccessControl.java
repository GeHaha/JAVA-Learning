
//test 5(2) 创建一个带有public，private，protected和包访问权限域以及方法成员的类
public class E05_AccessControl{
	public int a;
	private int b;
	protected int c ;
	int d ; //package access
	
	public void f1(){}
    private void f2(){}
	protected void f3(){}
	void f4(){}//pacakage access
		public static void main(String[] args){
		E05_AccessControl test = new E05_AccessControl();
		test.a = 1;
		test.b = 2;
		test.c = 3;
		test.d = 4;
		test.f1();
		test.f2();
		test.f3();
		test.f4();
	}
}