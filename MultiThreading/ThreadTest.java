package BasicThread;

class myThread extends Thread
{
	public void run()
	{
		for(int i=0;i<6;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		try
		{
			this.sleep(1200);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

public class ThreadTest
{
	public static void main(String[] args)
	{
         myThread t1=new myThread();
         myThread t2=new myThread();
         myThread t3=new myThread();
         t1.setName("Thread 1");
         t2.setName("Thread 2");
         t3.setName("Thread 3");
         t1.run();
         t1.start();
         
         try 
         {
			t1.join();
		} catch (InterruptedException e)
         {
			e.printStackTrace();
		}
         t2.start();
         t3.start();
	}

}
