package mobile.windows;

public class nokia 
{
	String name;
    float price;
    int storage;
    public nokia(String name,float price,int storage)
    {
    	this.name=name;
    	this.price=price;
    	this.storage=storage;
    }
    public String toString()
    {
    	return "Name= "+name+"  Price= "+price+"Rs  Storagr= "+storage+"GB";
    }
    public void display()
    {
    	System.out.println("This is nokia mobile.");
    }
}
