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
