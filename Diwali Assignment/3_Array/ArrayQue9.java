import java.util.*;
class ArrayQue9
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
				System.out.print(i*i+" ");
			else
				System.out.print(i*i*i+" ");
		}
	}
	
}