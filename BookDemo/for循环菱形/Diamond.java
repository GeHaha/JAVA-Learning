

public class Diamond{
	public static void main(String args[]){
		//�����ϲ�
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
			//�°벿�ֿո�ѭ��
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

