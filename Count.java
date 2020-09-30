import java.io.*;

class Count{
	public static void main(String args[]) throws IOException{
		int c=0,w=1,l=0;
		BufferedReader br1 = new BufferedReader(new FileReader("f2.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("f2.txt"));
		BufferedReader br3 = new BufferedReader(new FileReader("f2.txt"));
		
		while(br1.read() != -1)
			c++;
		
		int x = br2.read();
		while(x != -1){
			if((char)x == ' ' || (char)x == '\n')
				w++;
			x = br2.read();
		}
	
		while(br3.readLine() != null)
			l++;
		
		System.out.println("Number of chracters: " + c);
		System.out.println("Number of words:     " + w);
		System.out.println("Number of lines:     " + l);
		
		
		System.out.println("Number of chracters: " + c,w);
		
	}
}
		
