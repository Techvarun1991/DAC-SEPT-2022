class Q12
{	
	
	
	public static void main(String args[])
	{
		
		
		
		for(char i='A'; i<'G';i++)
		{
			for (char k =i;k<('G'-1);k++)
			{
				System.out.print(" ");
				
			}
			
			for (char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}	
			
		System.out.println();
		
		}
	}
}

/*
E:\java\notepadfilesofjava\diwali assignment\Solution\Star problem>java Q12
     A
    A B
   A B C
  A B C D
 A B C D E
A B C D E F
*/