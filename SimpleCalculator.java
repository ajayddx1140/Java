import java.util.Scanner;

class SimpleCalculator
{
public static void main(String s[])
{
	System.out.println("Enter Two Numbers");
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("+,-,*,/");
	char operator = sc.next().charAt(0);
	int output=0;
	switch(operator)
	{
	case '+':
	output=a+b;
	break;
	
	case '-':
	output=a-b;
	break;
	
	case '*':
	output=a*b;
	break;
	
	case '/':
	output=a/b;
	break;
	
	default:
	System.out.println("Wrong Choice");
	}
	System.out.println("Output is:"+output);
}
}