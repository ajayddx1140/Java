import java.util.*;
class Comm
{
	public static void main(String s[])
	{
	System.out.println("Enter Two Numbers");
	Scanner sc = new Scanner(System.in);
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	
	A a = new A();
	B b = new B();
	A r;
	r=a;
	r.Square(n1,n2);
	r=b;
	r.Square(n1,n2);
	
	}
	}
	
	class A
	{
	void Square(int a,int b)
	{
	System.out.println("Square of 1st no. is :"+(a*a));
	System.out.println("Square of 2nd no. is :"+(b*b));
	}
	}
	class B extends A
	{
	void Square(int a,int b)
	{
	System.out.println("Sum is : "+(a+b));
	}
	}