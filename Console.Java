import java.io.Console;
public class Main
{
    public static void main (String[] args) 
    {
        Console c=System.console();
        System.out.println("enter Nmame :");
        String nm=c.readLine();
        System.out.println("Enter Age :");
        int a=Integer.parseInt(c.readLine());
        System.out.println("Name= "+a);
    }
}
