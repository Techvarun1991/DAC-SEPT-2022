import java.util.*;
class ArrayQue1
{
	public static void print(int arr[])
	{
		int n = arr.length;
		for(int i = 0;i<n;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter the elements in array ");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		print(arr);
	}
}