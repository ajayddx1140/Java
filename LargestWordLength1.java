import java.util.*;
class LargestWordLength1
{
	public static void main(String s[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String");
	
	String st = sc.nextLine();
	String word = " ";
	String longest = " ";
	int i,l,lw,max=0;
	char ch;
	
	st=st+" ";
	l=st.length();
	for(i=0;i<l;i++)
	{
	ch=st.charAt(i);
	if(ch!=' ')
	{
	word = word + ch;
	}
	else
	{
	lw=word.length();
	if(lw>max)
	{
	max=lw;
	longest=word;
	}
	word=" ";
	}
	}
	System.out.println(longest);
	}
	}