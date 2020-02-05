class Tortoise extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			System.out.println("Distance Covered By Tortoise "+i);
		}
			System.out.println("Tortoise Wins !!");	
		
	}
}

class TortoiseHareRace
{
	public static void main(String s[])
	{
	Thread t = new Tortoise();
	t.start();
	for(int i=1;i<=25;i++)
	{
		System.out.println("Distance Covered By Hare "+i);
	}
	System.out.println("Hare is going to sleep ");
		try{
			Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
			System.out.println("Thread Sleeps");
			}
			System.out.println("Hare is going to start");
			for(int i=26;i<=50;i++)
			{
				System.out.println("Distance Covered By Hare "+i);
			}
			System.out.println("Hare has Completed Race");
	}
	}
