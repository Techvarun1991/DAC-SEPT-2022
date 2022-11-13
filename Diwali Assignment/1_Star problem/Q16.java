class Q16
{	
	
	
	public static void main(String args[])
	{
		int t=1;
		for(int i=t;i<=(t+4);i++)
		{
			for(int k=(t+11);k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
		System.out.println();
		}
		
		
			t=t+2;
			for(int i=t;i<=(t+4);i++)
		{
			for(int k=(t+9);k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
		System.out.println();
		}
		
		
		t=t+2;
			for(int i=t;i<=(t+4);i++)
		{
			for(int k=(t+7);k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
		System.out.println();
		}
		
		//7start
		t=t+2;
			for(int i=t;i<=(t+4);i++)
		{
			for(int k=(t+5);k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
		System.out.println();
		}
		
		//9 star
		t=t+2;
			for(int i=t;i<=(t+4);i++)
		{
			for(int k=(t+4);k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
			System.out.print("* ");
			}
		System.out.println();
		}
		
		
		for(int i=0;i<4;i++)
		{
			for(int k=0;k<9;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
}
}


/*
E:\java\notepadfilesofjava\diwali assignment\Solution\Star problem>javac Q16.java

E:\java\notepadfilesofjava\diwali assignment\Solution\Star problem>java Q16
            *
           * *
          * * *
         * * * *
        * * * * *
          * * *
         * * * *
        * * * * *
       * * * * * *
      * * * * * * *
        * * * * *
       * * * * * *
      * * * * * * *
     * * * * * * * *
    * * * * * * * * *
      * * * * * * *
     * * * * * * * *
    * * * * * * * * *
   * * * * * * * * * *
  * * * * * * * * * * *
    * * * * * * * * *
   * * * * * * * * * *
  * * * * * * * * * * *
 * * * * * * * * * * * *
* * * * * * * * * * * * *
        * * * *
        * * * *
        * * * *
        * * * *

E:\java\notepadfilesofjava\diwali assignment\Solution\Star problem>javac Q16.java

E:\java\notepadfilesofjava\diwali assignment\Solution\Star problem>java Q16
            *
           * *
          * * *
         * * * *
        * * * * *
          * * *
         * * * *
        * * * * *
       * * * * * *
      * * * * * * *
        * * * * *
       * * * * * *
      * * * * * * *
     * * * * * * * *
    * * * * * * * * *
      * * * * * * *
     * * * * * * * *
    * * * * * * * * *
   * * * * * * * * * *
  * * * * * * * * * * *
    * * * * * * * * *
   * * * * * * * * * *
  * * * * * * * * * * *
 * * * * * * * * * * * *
* * * * * * * * * * * * *
         * * * *
         * * * *
         * * * *
         * * * *

*/