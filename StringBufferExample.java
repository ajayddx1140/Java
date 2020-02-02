class StringBufferExample
{
public static void main(String s[])
{
	StringBuffer sb = new StringBuffer();
	System.out.println(sb.capacity());
	sb.append("This is Java Programming Lab");
	System.out.println(sb.capacity());
	sb.setCharAt(8,'2');
	sb.trimToSize();
	System.out.println(sb.capacity());
	sb.ensureCapacity(10);
	System.out.println(sb.capacity());
	sb.ensureCapacity(50);  
	System.out.println(sb.capacity());
}  
}