class Q22
{
	int x=12;  //instance variable but not static 
				//will require and object with "new" be created to access it in class/method. 
	
	static int y=10;
	
	static void display()
	{
		Q23 s1 = new Q23();
		System.out.println(s1.x);
		System.out.println(y);
	}
	public static void  main(String args[])
	{
		Q23 s1 = new Q23();
		
		display();
		System.out.println(s1.x);
	
	
	
	}

}