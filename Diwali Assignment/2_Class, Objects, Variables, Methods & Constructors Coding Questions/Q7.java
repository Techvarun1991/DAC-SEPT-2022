interface Shape
{
	void area();

}

class Circle implements Shape
{
	int r = 5;
	
	public  void area()
	{
		int areaCal = (int)(2*3.14*r);
		System.out.println("Area of circle "+areaCal);
	
	}

}
class Rectangle implements Shape
{

	int l = 5;
	int b = 7;
	
	public   void area()
	{
		int areaCal = l*b;
		System.out.println("Area of rectangle"+areaCal);
	
	}

}

class Q7
{
	public static void main(String args[])
	{
	Circle c1 = new Circle();
	Rectangle r1 = new Rectangle();
	
	c1.area();
	
	r1.area();
	
	}
}