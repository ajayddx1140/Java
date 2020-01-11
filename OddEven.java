import java.util.Random;

class Even implements Runnable{
	public int x;
	public Even(int x){
		this.x=x;
	}
	
	public void run(){
		System.out.println("Even thread,square of " + x + " = " + (x*x));
	}
}

class Odd implements Runnable{
	public int x;
	public Odd(int x){
		this.x=x;
	}
	
	public void run(){
		System.out.println("Odd thread,cube of " + x + " = " + (x*x*x));
	}
}

class USE extends Thread{
	public void run(){
		int num = 0;
		Random r = new Random();
		try{
			for(int i=0;i<5;i++){
				num = r.nextInt(20);
				System.out.println("Generated no: " + num);
				if(num%2==0){
					Thread t1 = new Thread(new Even(num));
					t1.start();
				}
				else{
					Thread t2 = new Thread(new Odd(num));
					t2.start();
				}
			Thread.sleep(1000);
			}
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

class OddEven{
	public static void main(String args[]){
		USE a = new USE();
		a.start();
	}
}

