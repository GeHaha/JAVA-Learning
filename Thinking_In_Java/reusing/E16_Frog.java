class Amphibian{
	public void moveInWater(){
		System.out.println("Moving in Water");
	}
	public void moveOnLand(){
		System.out.println("Moving on Land");
	}
}
class Frog extends Amphibian{
	}
public class E16_Frog {
	public static void main(String [] args){
		//��main�С�����һ��Frog������ת����Amphibian��Ȼ��˵�����з������ɹ���
		Amphibian a = new Frog();
		a.moveInWater();
		a.moveOnLand();
		
	}
}