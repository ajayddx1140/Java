import java.io.File;

class PrintFiles{
	public static void main(String args[]){
		int count = 0;
		File f = new File("C:");
		String []s = f.list();
		for(String s1 : s){
			File f1 = new File(s1);
			if(f1.isFile()){
				count++;
				System.out.println(s1);
			}
		}
	}
}