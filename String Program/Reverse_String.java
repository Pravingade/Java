public class Main
{
	public static void main(String[] args) 
	{
	    String s="Welcome To Profound Education ";
	    String n[]=s.split("\\s");
	    StringBuffer sb=new StringBuffer();
	    
	    for(int i=0;i<n.length;i++)
	    {
	         StringBuffer sb1=new StringBuffer(n[i]);
	         sb1.reverse();
	         sb.append(sb1+" ");
	    }
	    System.out.println(s);
	    System.out.println(sb);
	}
}
