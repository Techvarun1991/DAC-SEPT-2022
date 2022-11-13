class Q24
{
	public static void main(String args[])
	{
	for(int i=1;i<=5;i++)
	{
		int l=i;
		int k=4;
		for(int j=1;j<=i;j++)
		{	
			
			if(j>1)
			{
				l=l+k;
			}
			
				
			System.out.print(l+" ");
			if(j>1)
			{
				k--;
			}
			
		}
		System.out.println();
	}
	}

}

/*
E:\java\notepadfilesofjava\Module3 DSA\Day5>java Q24
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

*/