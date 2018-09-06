/*
使其能够演示基类和导出类的初始化顺序。
然后向基类和导出类中添加成员对象，并说明构建期间初始化发生的顺序
*/
class Member{
	public Member(String id){
		System.out.println("Member constructor" +id);
	}
}
class Rodent2{//基类
		Member m1 = new Member("r1"),m2 = new Member("r2");
		public Rodent2(){
			System.out.println("Rodent constructor");
		}
		public void hop(){System.out.println("Rodent hopping");}
		public void scurry(){System.out.println("Rodent scurrying");}
		public void reproduce(){System.out.println("Making more Rodents");}
		public String toString(){return "Rodent";}
}
class Mouse2 extends Rodent2{//导出类
	Member m1 = new Member("m1"),m2 = new Member("m2");
	public Mouse2(){
		System.out.println("Mouse constructor");
		}
	public void hop(){System.out.println("Mouse hopping");}
	public void scurry(){System.out.println("Mouse scurrying");}
	public String toString(){return "Mouse";}
}
class Gerbil2 extends Rodent{
		Member m1 = new Member("g1"), m2 = new Member("g2");
		public Gerbil2(){
			System.out.println("Gerbil constructor");
		}
		public void hop(){System.out.println("Gerbil hopping ");}
		public void scurry(){System.out.println("Gerbil scurrying");}
		public void reproduce(){System.out.println("Making more Gerbils");}
		public String toString(){return "Gerbil";}
}
class Hamster2 extends Rodent2 {
	Member m1 = new Member("h1"),m2 = new Member("h2");
	public Hamster2(){
		System.out.println("Hamster constructor");
		}
		public void hop(){System.out.println("Hamster hopping ");}
		public void scurry(){System.out.println("Hamster scurrying");}
		public void reproduce(){System.out.println("Making more Hamsters");}
		public String toString(){return "Hamster";}
}
public class E12_RodentInitialization{
	public static void main(String [] args){
		new Hamster2();//使用new+构造方法，创建新对象
	//构造方法是定义在java类中一个用来初始化对象的方法
	//new Hamster2();初始化函数，首先是基类初始化
	}
}











