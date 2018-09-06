class Rodent{
	public void hop(){System.out.println("Rodent hopping");}
	public void scurry(){System.out.println("Rodent scurrying");}
	public void reproduce(){System.out.println("Making more Rodent");}
	public String toString(){return "Rodent";}
}
class Mouse extends Rodent{
	public void hop(){System.out.println("Mouse hopping");}
	public void scurry(){System.out.println("Mouse scurrying");}
	public void reproduce(){System.out.println("Making more Mice");}
	public String toString(){return "Mouse";}
}
class Gerbil extends Rodent{
	public void hop(){System.out.println("Gerbil hopping");}
	public void scurry(){System.out.println("Gerbil scurrying");}
	public void reproduce(){System.out.println("Making more Gerbils");}
	public String toString(){return "Gerbil";}
}
class Hamster extends Rodent{
	public void hop(){System.out.println("Hamster hopping");}
	public void scurry(){System.out.println("Hamster scurrying");}
	public void reproduce(){System.out.println("Making more Hamsters");}
	public String toString(){return "Hamster";}
}

public class E09_Rodents{
	public static void main(String[] args){
		Rodent [] rodents={new Mouse(),new Gerbil(),new Hamster(),}; //创建Rodent数组，填充不同的Rodent类型
		
		for(Rodent r:rodents){  //调用基类方法
			r.hop();
			r.scurry();
			r.reproduce();
			System.out.println(r);
	}
}
}









