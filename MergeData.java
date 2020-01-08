import java.io.*;

class MergeData{
	public static void main(String args[]) throws IOException{
		PrintWriter pw1 = new PrintWriter("f1.txt");
		PrintWriter pw2 = new PrintWriter("f2.txt");
		pw1.println("A");
		pw1.println("B");
		pw1.println("C");
		pw2.println("1");
		pw2.println("2");
		pw2.println("3");
		pw1.close();
		pw2.close();
		
		PrintWriter pw3 = new PrintWriter("f3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("f1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("f2.txt"));
		
		String line1 = br1.readLine();
		String line2 = br2.readLine();
		
		while(line1 != null || line2 != null){
			pw3.println(line1);
			line1 = br1.readLine();
			pw3.println(line2);
			line2 = br2.readLine();
		}
		pw3.close();
		br1.close();
		br2.close();
		
		BufferedReader br3 = new BufferedReader(new FileReader("f3.txt"));
		String line3 = br3.readLine();
		
		while(line3 != null){
			System.out.println(line3);
			line3 = br3.readLine();
		}
		br3.close();
	}
}
	
		