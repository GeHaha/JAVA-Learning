
//����һ���������κη����ĳ����࣬�������ﵼ��һ���࣬�����һ������������һ����̬�����������Խ���
//ָ���������ã���������ת�͵����࣬Ȼ���ٵ��øþ�̬������
//��main�����У�չ���������������Ȼ��Ϊ�����еķ�������abstract��������������Ҫ����ת�͡�



abstract class NoMethods{}
//�������κη����ĳ�����
class Extend1 extends NoMethods{
	public void f(){
		System.out.println("Extended1.f");
	}//����һ���࣬����ӷ���
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
	public static void test2(WithMethods wm){//����һ����̬�����������Խ���ָ���������ã���������ת�͵����࣬Ȼ���ٵ��øþ�̬������
		wm.f();
	}
	public static void main(String [] args){
		NoMethods nm =  new Extend1();
		test1(nm);
		WithMethods wm = new Extended2();
		test2(wm);
	}
}




















