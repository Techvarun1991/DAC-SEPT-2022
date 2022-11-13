abstract class Parent1   //an abstract class cant have a object, to accesss it inherit it.
{
	public abstract void method();   //an abstract method dont have a body.
	
	public void method1()   //simple method 
	{
		System.out.println("Regular method sop statement in abstract class");
	}

}
class Parent2 extends Parent1		//inheriting abstract clas
{
	
	public void method()
	{
		
		System.out.println("overwriting the abstract method in inherited class");
	}

}

class Q1
{
	public static void main(String args[])
	{
		//Parent1 P1 = new Parent1();   // error: Parent1 is abstract; cannot be instantiated
		Parent2 P2 = new Parent2();
		
		P2.method();
		P2.method1();
	
	}

}