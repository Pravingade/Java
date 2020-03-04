public class Main
{
	public static void main(String[] args) 
	{
	    String s="Welcome ";
	    String nm=new String("Profound Edutech");
	    char arr[]={'j','a','v','a'};
	    String s1=new String(arr);
	    System.out.println(s+" "+nm+" "+s1);
	    s=s.concat("To Profound");
	    System.out.println(s);
	    System.out.println(s.toLowerCase());
	    System.out.println(s.toUpperCase());
	    if(s1.equalsIgnoreCase("JAVA"))
	    {
	        System.out.println("True");
	    }
	    else
	    {
	        System.out.println("False");
	    }
	    System.out.println("Length: "+s.length());
	    System.out.println(s.substring(8));
	    System.out.println(s.charAt(12));
	    System.out.println(s.replace('o','i'));
	    String m="Welcome to profound edutech pvt ltd";
	    String []a=m.split("\\s",4);
	    for(int i=0;i<4;i++)
	    {
	        System.out.println(a[i]);
	    }
	}
}
