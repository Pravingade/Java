
class worker1 implements Runnable
{
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            System.out.println(Thread.currentThread().getName()+" putting a job ");
        }
        try 
        {
          Thread.currentThread().sleep(200); 
        } 
        catch(InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}


class worker2 implements Runnable
{
    public void run()
    {
        for(int i=1;i<6;i++)
        {
            System.out.println(Thread.currentThread().getName()+" executing a job ");
        }
        try 
        {
          Thread.currentThread().sleep(200); 
        } 
        catch(InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    worker1 w1=new worker1();
	    worker2 w2=new worker2();
	    Thread t1=new Thread(w1,"Pravin");
	    Thread t2=new Thread(w2,"Akshay");
	    
	    
	   // t1.run();   // This run method is use to run the main thread
	    t1.start();
	    t2.start();
	    
	    try
	    {
	        t1.join();
	    }
	    catch(InterruptedException e)
	    {
	        e.printStackTrace();
	    }
	   
	}
}
