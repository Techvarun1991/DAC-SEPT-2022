import java.util.*;
class ArrayQue13
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
	public static void sortA(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void sortD(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
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
		sortA(arr);
		print(arr);
		sortD(arr);
		print(arr);
	}
}