class printer
{
	static printer p=null;
	private printer()
	{
		System.out.println("Printer started...");
	}
	static printer getInstance()
	{
		if(p==null)
			p=new printer();
		return p;	
	}
	void print(String d)
	{
		System.out.println("Printing..."+d);
	}
}
public class SingletonTest 
{
	public static void main(String[] args)
	{
        printer p=printer.getInstance();
        p.print("1234");
        printer p2=printer.getInstance();
        p2.print("5678");
	}

}
