import Mypack.ArithmeticOperation;
import java.util.*;

class UseArithmetic
{
	public static void main(String s[])
	{
		double a;
		double b;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number :");
		a = sc.nextDouble();
		
		System.out.println("Enter Second Number :");
		b = sc.nextDouble();
		
		ArithmeticOperation A = new ArithmeticOperation();
		
		System.out.println("Sum = "+A.Sum(a,b));
		System.out.println("Subtraction = "+A.Sub(a,b));
		System.out.println("Multiplication = "+A.Multi(a,b));
		System.out.println("Divide = "+A.Div(a,b));
		
	}
}