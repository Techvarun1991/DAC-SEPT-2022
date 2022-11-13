//the method which will be different for each class can be made abstract....later class can change it accordingly.
//the method which will be same for all the class can be defined in parent class itself.



abstract class Cdac  //an abstract class cant have a object, to accesss it inherit it.
{
	public abstract void id();   //an abstract method dont have a body, it is different for different class.
	
	public void zoom()   //simple method 
	{
		System.out.println("here at cdac we use zoom");
	}

}
class Employee extends Cdac 		//inheriting abstract clas
{
	
	public void id()
	{
		
		System.out.println("method of allocating id to employee of cdac is different");
	}

}

class Student extends Cdac 
{
	public void id()
	{
		
		System.out.println("method of allocating id to student of cdac is different");
	}


}


class Q2
{
	public static void main(String args[])
	{
		//Cdac C1 = new Cdac();   // error: Parent1 is abstract; cannot be instantiated
		Student S1 = new Student();
		Employee E1 = new Employee();
		
		E1.id();
		S1.id();
		E1.zoom();
		S1.zoom();
	}

}