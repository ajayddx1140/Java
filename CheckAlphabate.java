import java.util.Scanner;

class CheckAlphabate
{
public static void main(String s[])
{
	boolean isVowel=false;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Char");
	char ch = sc.next().charAt(0);
	switch(ch)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':
	isVowel=true;
	}
	if(isVowel==true)
	{
	System.out.println("Char is Vowel");
	}
	else if((ch>'a' && ch<='z') || (ch>'A' && ch<='Z'))
	{
	System.out.println("Char is Consonant");
	}
	else 
	{
	System.out.println("Invalid Char");
	}
	}
	}