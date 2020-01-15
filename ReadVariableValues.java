import java.util.Scanner;

class ReadVariableValues
{
public static void main(String s[])
{
	System.out.println("Enter String value");
	Scanner sc = new Scanner(System.in);
	String name = sc.nextLine();
	
	
	System.out.println("Enter integer value");
	int a = sc.nextInt();
	
	
	System.out.println("Enter float value");
	float b = sc.nextFloat();
	
	
	System.out.println(name);
	System.out.println(a);
	System.out.println(b);
	}
	}
	