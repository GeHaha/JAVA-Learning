abstract class BaseWithPrint{
	public BaseWithPrint(){
		print();
	}//����Ĺ������е����������
	public abstract void print();	//����һ�����࣬�������󷽷�print����
}
class DerivedWithPrint extends BaseWithPrint{
	int i = 47;
	public void print(){ //�������и���print�������������ǵķ����汾���Դ�ӡ�������ж����ĳ�����α�����ֵ
		System.out.println("i = " + i);
	}
}
public class Initialization{
	public static void main(String [] args){
		DerivedWithPrint dp = new DerivedWithPrint(); //����һ�����������Ȼ���������print��������
		dp.print();
	}
}
