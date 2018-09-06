

public class Diamond{
	public static void main(String args[]){
		//菱形上部
		for(int i=1;i<=10;i++)
			{for(int j=10;j>=i;j--)
				{
					System.out.println("");
				}
				for(int k=1;k<i*2;k++)
				{
					System.out.println("*");
				}
					System.out.println();
			}
		for(int l=1;l<10;l++)
		{
			//下半部分空格循环
			for(int m=0;m<=1;m++)
			{
				System.out.println(" ");
			}
			for(int n=19;n>1*2;n--)
			{
				System.out.println("*");
			}
			System.out.println();
		}
	}
}

