//创建一个Cycle类，它具有子类Unicycle，Bicycle，Tricycle。演示每一个类型的实例都可以经由ride（）
//方法向上转型为Cycle
public class E01_Upcasting {
	public static void ride(Cycle c){}
	public static void main(String[] args){
	ride(new Cycle());//No upcasting
	ride(new Unicycle());//Upcast
	ride(new Bicycle());//Upcast
	ride(new Tricycle());//Upacat
	}
}