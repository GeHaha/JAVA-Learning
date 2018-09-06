 public class GetBoolean{                //创建类
	public  static void main(String arg[]){
		Boolean b1 = new Boolean(true);  //创建Boolean对象
		Boolean b2 = new Boolean("ok");  
		System.out.println("b1 :" + b1.booleanValue());
		System.out.println("b2 :" + b2.booleanValue());
	}
}
