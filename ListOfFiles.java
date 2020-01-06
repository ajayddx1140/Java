import java.io.File;

class ListOfFiles{
	public static void main(String args[]){
		int count = 0;
		File f = new File("C:\\JavaPrograms");
		String []s = f.list();
		for(String s1 : s){
			count++;
			System.out.println(s1);
		}
	}
}
