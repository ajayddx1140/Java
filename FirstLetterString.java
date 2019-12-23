import java.util.*;
class FirstLetterString
{
	public static void main(String s[])
	{
	System.out.println("Enter String");
	Scanner sc = new Scanner(System.in);
	String st = sc.nextLine();
	st=" "+st;
	st=st.toUpperCase();
	System.out.println("String is :"+st);
	int l=st.length();
	for(int i=0;i<l;i++)
	{
	if(st.charAt(i)==' ')
	{
	System.out.print(st.charAt(i+1)+".");
	}
	}
	}
	}