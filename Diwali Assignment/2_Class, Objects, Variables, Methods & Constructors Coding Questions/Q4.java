class OuterClass    //for static inner class
{
	static int a=10;
	
	static class InnerClass
	{
		static int b=10;
		static int c = a*b; 		//inner class accessing outer class
									//but outer class cannot access inner class .
	}

}

class Q4
{
	public static void main(String args[])
	{
		OuterClass oc1 = new OuterClass();
		//OuterClass.InnerClass c1 = oc1.new  InnerClass();   //making object of inner class using outerclasss  //for non static class
		
		OuterClass.InnerClass c2 = new OuterClass.InnerClass();
		
		
		System.out.println(oc1.a);
		System.out.println(c2.b);
		System.out.println(c2.c);
		//System.out.println(oc1.b);		outer class cannot inherit neither access innerclass 
		
	}

} 