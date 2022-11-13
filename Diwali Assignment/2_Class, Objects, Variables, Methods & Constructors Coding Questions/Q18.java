
class Q18 
{
	static String x;
	static String y;
	static int i;
	static int j;
	
	Q18()
	{
	}
	
	Q18(String x,String y)
	{
		this.x = x;
		this.y = y;
		
	}
	Q18(int x,int y)
	{
		this.i = x;
		this.j = y;
		
	}
	
	
	
	public static void main(String args[])
	{
		Q18 s1 = new Q18("Yogi","Rao");
		Q18 s2 = new Q18(5,10);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(i);
		System.out.println(j);
	}
	
}