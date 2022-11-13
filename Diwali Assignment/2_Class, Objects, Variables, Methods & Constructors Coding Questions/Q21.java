class Parent
{
	static int x;
	static int y;
}
class Q21 extends Parent
{
	Q21()
	{
	}
	
	Q21(int x,int y)
	{
		super.x = x;
		super.y = y;
		
	}
	
	
	
	public static void main(String args[])
	{
		Q21 s1 = new Q21(5,10);
		System.out.println(x);
		System.out.println(y);
	}
	
}