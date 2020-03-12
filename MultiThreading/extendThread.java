
class mythread extends Thread
{
    public void run()
    {
        for(int i=1;i<6;i++)
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
public class Main
{
	public static void main(String[] args) 
	{
	    mythread t1=new mythread();
	    mythread t2=new mythread();
	    mythread t3=new mythread();
	    t1.setName("Thread 1");
	    t2.setName("Thread 2");
	    t3.setName("Thread 3");
	    
	    //t1.run();
	    //t1.start();
	    //t2.start();
	    //t3.start();
	    try
	    {
	        t1.join();
	    }
	    catch(InterruptedException e)
	    {
	        e.printStackTrace();
	    }
	    
		System.out.println("Priority T1: "t1.getPriority());
    t1.setPriority(Thread.MIN_PRIORITY+2);
    System.out.println("Priority T1: "+t1.getPriority());
	}
}
