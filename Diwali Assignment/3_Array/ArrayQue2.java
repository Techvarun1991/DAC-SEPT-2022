import java.util.*;
class ArrayQue2
{
	public static void print(int arr[])
	{
		int n = arr.length;
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static boolean equality(int a1[],int a2[])
	{
		if(a1.length == a2.length)
		{
			for(int i = 0;i<a1.length;i++)
			{
				if(a1[i] == a2[i])
					return true;
			}
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array 1");
		int n = sc.nextInt();
		
		int a1[] = new int[n];
		
		System.out.println("Enter the elements in array 1");
		for(int i = 0;i<n;i++)
		{
			a1[i] = sc.nextInt();
		}
		System.out.println("Enter the size of array 2 ");
		int m = sc.nextInt();
		
		int a2[] = new int[m];
		
		System.out.println("Enter the elements in array 2");
		for(int i = 0;i<m;i++)
		{
			a2[i] = sc.nextInt();
		}
			
		System.out.println("Array 1 ");
		print(a1);
		
		System.out.println("\nArray 2");
		print(a2);
		
		if(equality(a1,a2))
			System.out.println("\nEqual");
		else
			System.out.println("\nNot Equal");
	}
}