class Q8
{
	static int counter =0;
	/*{
		counter = counter +1;				//instance block, it will be initialised everytime a object is created for Q8 class.
	}*/										//it is also correct otherwise default constructor run everytime object is created we can use it also
	Q8()
	{
		counter = counter +1;
		System.out.println("default constructor");
	}
	
	public static void main(String args[])
	{
	
		Q8 obj1 = new Q8();
		Q8 obj2 = new Q8();
		Q8 obj3 = new Q8();
		
		System.out.println("No of objects are "+counter);
	}


}