//����һ��Cycle�࣬����������Unicycle��Bicycle��Tricycle����ʾÿһ�����͵�ʵ�������Ծ���ride����
//��������ת��ΪCycle
public class E01_Upcasting {
	public static void ride(Cycle c){}
	public static void main(String[] args){
	ride(new Cycle());//No upcasting
	ride(new Unicycle());//Upcast
	ride(new Bicycle());//Upcast
	ride(new Tricycle());//Upacat
	}
}