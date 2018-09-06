public class AccessProperty{
	int i = 47;
	public void call(){
		System.out.println("调用call()方法");
		for(i = 0;i < 3;i++){
			System.out.print(i + "");
			if (i == 2){
				System.out.println("\n");
			}
		}
	}
	public AccessProperty(){            //定义构造方法
	}
	public static void main(String[] args){  //定义主方法
		AccessProperty t1 = new AccessProperty();//创建一个对象
		AccessProperty t2 = new AccessProperty();//创建另一个对象
		t2.i = 60;                             //将类成员变量赋值为60
		System.out.println("第一次实例对象调用变量i的结果 ：" + t1.i++);
		t1.call();                             //使用第一个对象调用类成员方法
		System.out.println("第二次实例对象调用变量i的结果 ：" + t2.i);
		t2.call();
	}
}