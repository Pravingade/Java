package ListCollection;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class BookList 
{
	public static void main(String[] args)
	{
         Scanner sc=new Scanner(System.in);
         LinkedList<Book> bl=new LinkedList<>();
         bl.add(new Book(101,"java",749f));
         bl.add(new Book(102,"javaScript",449f));
         int ch;
         do
         {
        	 System.out.println("Enter your choice:\n 1: AddBook\n 2: RemoveBook\n 3: SearchBook\n 4: DisplayBook\n");
        	 ch=sc.nextInt();
        	 int bid;
        	 String name;
        	 float price;
        	 switch(ch)
        	 {
        	 case 1:System.out.println("Enter book id name and price of book: ");
        	        bid=sc.nextInt();
        	        name=sc.next();
        	        price=sc.nextFloat();
        	        Book b=new Book(bid,name,price);
        	        bl.add(b);
        	        break;
        	 case 2:System.out.println("Enter book id to remove book: ");
        	        bid=sc.nextInt();
        	        ListIterator<Book> it=bl.listIterator();
        	        while(it.hasNext())
        	        {
        	        	Book b1=it.next();
        	        	if(b1.bid==bid)
        	        	{
        	        	    it.remove();
        	        	    System.out.println("Rempved...");
        	        	}
        	        }
        	        break;
        	 case 3:System.out.println("Enter book id to search: ");
        	        bid=sc.nextInt();
        	        for(Book book:bl)
        	        {
        	        	if(book.bid==bid)
        	        	{
        	        		System.out.println("Found "+book);
        	        	}
        	        }
        	        break;
        	 case 4:for(Book book:bl)
        	       {
        		      System.out.println(book);
        	       }
        	       break;
        	 }
         }while(ch<=4);
	}

}
