public class AccessProperty{
	int i = 47;
	public void call(){
		System.out.println("����call()����");
		for(i = 0;i < 3;i++){
			System.out.print(i + "");
			if (i == 2){
				System.out.println("\n");
			}
		}
	}
	public AccessProperty(){            //���幹�췽��
	}
	public static void main(String[] args){  //����������
		AccessProperty t1 = new AccessProperty();//����һ������
		AccessProperty t2 = new AccessProperty();//������һ������
		t2.i = 60;                             //�����Ա������ֵΪ60
		System.out.println("��һ��ʵ��������ñ���i�Ľ�� ��" + t1.i++);
		t1.call();                             //ʹ�õ�һ������������Ա����
		System.out.println("�ڶ���ʵ��������ñ���i�Ľ�� ��" + t2.i);
		t2.call();
	}
}