class AnnonymousArray
{
public static void main(String s[])
{
	Sum(new int[]{10,20,30,40});
}
	
	public static void Sum(int []x)
	{
	int total=0;
	for(int x1:x)
	{
	total=total+x1;
	}
	System.out.println("Sum="+total);
	}
	}