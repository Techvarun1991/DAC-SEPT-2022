import java.util.*;
class ArrayQue3
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt
		int a[]=new int[n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		} 
		System.out.println("Enter the number which needs to be matched with the pair sum");
		int k=sc.nextInt();
		for(int i=0;i<n-1;i++)
		{
			int ele = k-a[i];
			inner:for(int j=i+1;j<n;j++)
			{
				if(a[j]==ele)
				{
					System.out.println(a[i]+", "+a[j]);
					break inner;
				}
			}
		}
	}
}