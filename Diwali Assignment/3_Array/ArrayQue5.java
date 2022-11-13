import java.util.*;
class ArrayQue5
{
	public static void print(int arr[])
	{
		System.out.println("\nElements in the array are");
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
		Arrays.sort(arr);
		System.out.println("Smallest element : "+arr[0]);
		System.out.println("Largest element : "+arr[n-1]);
	}
}