import java.util.*;
class ArrayQue8
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		if(n<3)
			return;
		int a[]=new int[n];
		System.out.println("Enter the elements in array");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int arr[] = new int[n-2];
		int i=0;
		while(i != n-2)
		{
			arr[i] = ((a[i]+a[i+1]+a[i+2])/3);
			i++;
		}
		for(int j = 0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
		}
	}
	
}