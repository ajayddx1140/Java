
	interface Exam
	{
	void per_cal();
	}
	
	
	class Student
	{
	String Name;
	int r,marks1,marks2;
	Student(String name,int roll,int m1,int m2)
	{
	Name=name;
	r=roll;
	marks1=m1;
	marks2=m2;
	}
	void Display()
	{
	System.out.println("Name :"+Name);
	System.out.println("Roll No. :"+r);
	System.out.println("Marks in two Subject - In First:"+marks1+"\nIn Second"+marks2);
	}
	}
	class Result extends Student implements Exam
	{
	float percent;
	Result(String n,int r,int m1,int m2)
	{
	super(n,r,m1,m2);
	}
	public void per_cal()
	{
	int total = marks1+marks2;
	percent = (float)total/2;
	}
	void Show()
	{
	Display();
	System.out.println("Percentage is :"+percent);
	}
	}
	class ReportCard
	{
	public static void main(String s[])
	{
	Result r = new Result("Ashish",16,80,82);
	r.per_cal();
	r.Show();
	}
	}
