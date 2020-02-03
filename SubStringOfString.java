import java.util.Scanner;
public class SubStringOfString {
 
    public static void SubString(String str, int n)
    {
       for (int i = 0; i < n; i++) 
           for (int j = i+1; j <= n; j++)
           
                System.out.println(str.substring(i, j));
    }
 
    public static void main(String s[])
    {
		System.out.println("Enter a String");
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SubString(str, str.length());
    }
}