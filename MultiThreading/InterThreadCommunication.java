class Buffer
{
    Boolean avillable=true;
    int data;
    synchronized void get() throws InterruptedException
    {
        if(avillable==true)
        {
            System.out.println("Buffer is Empty");
            System.out.println("Printer gose in waiting state ");
            wait();
        }
        System.out.println("Printing data: "+data);
        avillable=true;
        notify();
    }
    synchronized void put(int data) throws InterruptedException
    {
        if(avillable=false)
        {
            System.out.println("Buffer is full ");
            System.out.println("Doc gose into waiting state");
            wait();
        }
        this.data=data;
        avillable=false;
        System.out.println("Doc putting data.");
        notify();
    }
}

class printer extends Thread
{
    Buffer b;
    printer(Buffer b)
    {
        this.b=b;
    }
    public void run()
    {
        for(int i=0;i<6;i++)
        {
            try
            {
                b.get();
            }
            catch(InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

class DOC extends Thread
{
    Buffer b;
    DOC(Buffer b)
    {
        this.b=b;
    }
    public void run()
    {
        for(int i=0;i<6;i++)
        {
            try
            {
                b.put(i);
            }
            catch(InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
}

public class Main 
{
    public static void main(String [] args)
    { 
        Buffer b=new Buffer();
        printer p=new printer(b);
        DOC d=new DOC(b);
        p.start();
        d.start();
    }
}

