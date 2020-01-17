	interface Area
	{
	double pi=3.14;
	double cal_Area();
	}
	
	interface Display extends Area
	{
	void display_Area();
	}
	
	class Rectangle implements Display
	{
		double x,y;
	Rectangle(double a,double b)
	{
		x=a;
		y=b;
	}
	public double cal_Area()
	{
	return x*y;
	}
	public void display_Area()
	{
	System.out.println("Area of Rectangle is :"+cal_Area());
	}
	}
	
	class Circle implements Display
	{
	double radius;
	Circle(double r)
	{
	radius=r;
	}
	public double cal_Area()
	{
	return (pi*radius*radius);
	}
	public void display_Area()
	{
		System.out.println("Area of Circle is :"+cal_Area());
	}
	}
	
	class Square implements Display
	{
		double x;
		Square(double a)
		{
			x=a;
		}
		public double cal_Area()
		{
			return (x*x);
		}
		public void display_Area()
		{
			System.out.println("Area of Square is :"+cal_Area());
		}
	}
	
	class ShapesArea
	{
		public static void main(String s[])
		{
		Rectangle r = new Rectangle(5,6);
		r.cal_Area();
		r.display_Area();
		
		Circle c = new Circle(10);
		c.cal_Area();
		c.display_Area();
		
		Square sq = new Square(5);
		sq.cal_Area();
		sq.display_Area();
	}
	}