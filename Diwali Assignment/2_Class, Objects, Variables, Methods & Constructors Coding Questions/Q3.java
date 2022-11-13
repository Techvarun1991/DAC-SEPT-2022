class OuterClass  			//for non static inner class
{
	static int a=10;
	
	class InnerClass
	{
		static int b=10;
		static int c = a*b; 		//inner class accessing outer class
									//but outer class cannot access inner class .
	}

}

class Q3
{
	public static void main(String args[])
	{
		OuterClass oc1 = new OuterClass();
		OuterClass.InnerClass c1 = oc1.new  InnerClass();   //making object of inner class using outerclasss
		
		System.out.println(oc1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		//System.out.println(oc1.b);		outer class cannot inherit neither access innerclass 
		
	}

} 