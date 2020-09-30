import java.util.*;
class Hello
{
public static void main(String s[])
{
	int [] x = {1,2,3,4};
	char [] y = {'a','b','c','d'};
	
	for(int i = 0; i < x.length; i += 2)
		for(int j = y.length-1; j > 0; j--)
			if(((i+j) % 2) == 0)
				System.out.println("X element is called :");
				System.out.println(x[i]);
			else
				System.out.println("Y element is called :");
				System.out.println(y[j]);
				
			
}
}
