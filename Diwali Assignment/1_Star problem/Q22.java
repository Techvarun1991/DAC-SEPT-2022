class Q22
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int j=6;j>=i;j--)
			{
				System.out.print("1");
			}
			
			for(int k=0;k<i;k++)
			{
					System.out.print(i);
			}
			System.out.println();
		}
	}	
}

/*

E:\java\notepadfilesofjava\diwali assignment\Solution\Star problem>java Q22
1111111
1111122
1111333
1114444
1155555
1666666
7777777

*/