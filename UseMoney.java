class Money
{
	float rs;
	float pa;

	void Money()
	{
	System.out.println("Total rupees :"+rs+"Total paisa :"+pa);
	}
	void Money(float r,float p)
	{
	r=rs;
	p=pa;
	System.out.println("Total rupees 1 :"+r+"Total paisa 1 :"+p);
	}
	void Money(Money m)
	{
	System.out.println();
	}
	}
	
	class UseMoney
	{
	public static void main(String s[])
	{
	System.out.println("Enter Rupees and Paisa :");
	Scanner sc = new Scanner(System.in):
	float rup = sc.nextFloat();
	float paisa = sc.nextFloat();
	Money.rs=rup;
	Money.pa=paisa;
	Money m1 = new Money();
	Money m2 = new Money(rup,paisa);
	Money m3 = new Money(m2);