import java.util.Scanner;

class SwapTwoNo
{
public static void main(String s[])
{
	System.out.println("Enter 2 No.");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("No. before swapping ");
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	a=a-b;
	b=a+b;
	a=b-a;
	System.out.println("No. after swapping ");
	System.out.println("a="+a);
	System.out.println("b="+b);
	
	
	}
	}