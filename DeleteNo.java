import java.io.*;
class DeleteNo{
	public static void main(String args[]) throws IOException{
		PrintWriter pw1 = new PrintWriter("fn1.txt");
		PrintWriter pw2 = new PrintWriter("fn2.txt");
		pw1.println("8003000000");
		pw1.println("9003000000");
		pw1.println("7004000000");
		pw1.println("9005000000");
		pw2.println("9005000000");
		pw2.println("7004000000");
		pw1.close();
		pw2.close();
		
		PrintWriter pw3 = new PrintWriter("fn3.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("fn1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("fn2.txt"));
		
		String line1 = br1.readLine();
		
		int flag = 0;
		while(line1 != null){
			flag = 0;
			String line2 = br2.readLine();
			while(line2 != null){
				if(line1.equals(line2)){
					flag=1;
					break;
				}
				line2 = br2.readLine();
			}
			if(flag == 0){
				pw3.println(line1);
			}
			line1 = br1.readLine();
			
			int flag = 0;
			while(line1 != null){
				flag = 0;
				String line2 = br2.readLine();
			}
			// done with the flag
		}
			
		pw3.close();
	}
}
