class Q13
{
	public static void main(String args[])
	{
		for(int i=1;i<=6;i++)
		{	
			for(int l =5; l>=i;l-- )
			{
				System.out.print(" ");
			}
		
			for(int j =i; j>=1;j-- )
			{	
				//if(j==1)
				System.out.print(j);
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i=5;i>=1;i--)
		{
			for(int l =5; l>=i;l-- )
			{
				System.out.print(" ");
			}
			
			for(int j =i; j>=1;j-- )
			{
				System.out.print(j);
			}
			for(int k=2;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	
	}

}
/*
E:\java\notepadfilesofjava\diwali assignment\Solution\Star problem>java Q5
   1
  212
 32123
4321234
 32123
  212
   1

*/