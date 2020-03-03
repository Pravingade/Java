class Book
{
    String name;
    float price;
    public void setname(String name)
    {
        this.name=name;
    }
    public void setprice(float price)
    {
        this.price=price;
    }
    public String getName()
    {
        return name;
    }
    public float getprice()
    {
        return price;
    }
    Book()
    {
        System.out.println("Book is added ");
    }
    Book(String name,float price)
    {
        this.name=name;
        this.price=price;
    }
    public String toString()
    {
        return ("Book detail: "+name+" "+price);
    }
}
public class Main
{
	public static void main(String[] args) 
	{
	    Book b1=new Book("Java",850.90f);
	    Book b2=new Book("Angular",740.56f);
	    Book b3=new Book();
	    System.out.println(b1);
	    System.out.println(b2);
	    b3.setname("Python");
	    b3.setprice(540.75f);
	    System.out.println(b3);
	}
}
