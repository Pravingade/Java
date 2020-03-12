class Bookmyshow implements Runnable
{
    int avillable=5,req;
    public Bookmyshow(int req)
    {
        this.req=req;
    }
    public void run()
    {
        System.out.println("Welcome to Bookmyshow ");
        System.out.println("You selected "+req+" seats.");
        
        synchronized(this)   //this block is used when multiple thread try to execute  
        {
            if(req<avillable)
            {
            float amt=req*250;
            System.out.println("Total ammount to pay: "+amt);
            try
            {
                Thread.currentThread().sleep(500);
            }   
            catch(InterruptedException e) 
            {
                e.printStackTrace();
            } 
            
            System.out.println(Thread.currentThread().getName()+" Ticket Booked");
            avillable-=req;
            }
            else
            {
                System.out.println("Sorry "+Thread.currentThread().getName()+"No Ticket Avillable");
            }
        }
    }
}

public class Main 
{
    public static void main(String [] args)
    { 
        Bookmyshow b=new Bookmyshow(2);
        Thread t1=new Thread(b,"Pravin");
        Thread t2=new Thread(b,"Akshay");
        Thread t3=new Thread(b,"Sachin");
        t1.start();
        t2.start();
        t3.start();
    }
}

