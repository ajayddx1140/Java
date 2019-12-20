class Exception
{
	public static void main(String s[])
	{
	int a=10;
	int b=5;
	int c=5;
	int x,y;
	
	try{
		x=a/(b-c);
		}
		
		catch(ArithmeticException e){
			System.out.println("Divide By Zero Exception");
			}
		
	y=a/(b+c);
	System.out.println(y);
	
	}
}