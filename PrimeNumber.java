import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    int count=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Number :");
	    int n=sc.nextInt();
	    if(n==0)
	    {
	        System.out.println("zero is not prime number");
	    }
	    else
	    {
	    for(int i=1;i<=n;i++)
	    {
	        
	        if(n%i==0)
	        {
	            count++;
	        }
	    }
	    if(count<=2)
	    {
	    System.out.println(n+" is Prime number");
	    }
	    else
	    {
	        System.out.println(n+" is not Prime number");
	    }
	}
}
}
