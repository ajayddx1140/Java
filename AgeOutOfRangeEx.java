import java.util.*;
class MyException extends Exception
{
	String a;
	
	MyException(String b)
	{
		a=b;
	}
	?'
	
	void Display()
	{
		System.out.println("Age out of Range");
	}
}

class AgeOutOfRangeEx
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age :");
		int age = sc.nextInt();
		
		try
		{
			System.out.println("Age :"+age);
			if(age<20 || age>23)
			{
				throw new MyException("Error");
			}
		}
		catch(MyException e)
		{
			System.out.println("Exception Caught");
			e.Display();
		}
		
	}
}