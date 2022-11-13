class Q20
{
	public static void main(String args[])
	{
		for(int i=1;i<=7;i++)
		{
			for(int k =0; k<(i-1);k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=6;i>=1;i--)
		{
			for(int k =0; k<(i-1);k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=7;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}

/*
E:\java\notepadfilesofjava\diwali assignment\Solution\Star problem>java Q20
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
*/