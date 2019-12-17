class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
			try{
			Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
			System.out.println("Thread Sleeps");
			}
		}
	}
}

class DemoJoin
{
	public static void main(String s[]) throws InterruptedException 
	{
		MyThread t = new MyThread();
		t.start();
		t.join();
	
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}
}