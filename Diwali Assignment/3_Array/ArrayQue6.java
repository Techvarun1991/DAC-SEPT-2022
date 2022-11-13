import java.util.*;
class ArrayQue6
{
  public static void main(String []args)
  {
	int a[]=new int[]{24,54,31,16,82,45,67};
	int n = a.length;
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	for(int i=0;i<3;i++)
	{
		pq.add(a[i]);
	}
	for(int i = 3;i<n;i++)
	{
		if(pq.peek()<a[i])
		{
			pq.add(a[i]);
			pq.poll();	
		}
	}
    System.out.println("The Third Largest ele is "+pq.peek());
  }
}