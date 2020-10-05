package mobile.android;

public class redmi 
{
	String name;
    float price;
    int storage;
    public void display()
    {
    	System.out.println("This is Redmi mobile.");
    }
    public redmi(String name,float price,int storage)
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
