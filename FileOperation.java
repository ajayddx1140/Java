import java.io.*;

class FileOperation
{
	public static void main(String s[])
	{
		File f = new File(s[0]);
		
		System.out.println(f.getName());
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getParent());
		System.out.println(f.exists());
		System.out.println(f.canRead());
		System.out.println(f.lastModified());
		System.out.println(f.length());
		
	}
}