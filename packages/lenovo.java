package mobile.android;

public class lenovo 
{
    String name;
    float price;
    int storage;
    public void display()
    {
    	System.out.println("This is lenovo mobile.");
    }
    public lenovo(String name,float price,int storage)
    {
    	this.name=name;
    	this.price=price;
    	this.storage=storage;
    }
    public String toString()
    {
    	return "Name= "+name+"  Price= "+price+"Rs  Storagr= "+storage+"GB";
    }
    
}
