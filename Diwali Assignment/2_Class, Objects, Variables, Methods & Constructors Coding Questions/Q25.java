class Q25   //static block will be exexcuted first;
{
	static
	{
		System.out.println("Static block");
	
	}
	
	static void display()
	{
		System.out.println("Static method");
	
	}

	
	public static void  main(String args[])
	{
		display();
	
	
	
	}

}

/*

E:\java\notepadfilesofjava\diwali assignment\Solution\2_Class, Objects, Variables, Methods & Constructors Coding Questions>java Q25
Static block
Static method


*/