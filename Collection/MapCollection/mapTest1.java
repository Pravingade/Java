package MapCollection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class map1Test 
{
	public static void main(String[] args) 
	{
         Map<Integer,String> m=new TreeMap<>();
         m.put(1, "AAA");
         m.put(2,"BBB");
         m.put(3,"CCC");
         m.put(6, "XYZ");
         m.put(4, "PQR");
	
         if(m.containsKey(2))
		    System.out.println("Found");
         else
        	 System.out.println("Not Found");
         
         Set<Integer> keys=m.keySet();
         for(Integer k:keys)
         {
        	 System.out.println("Key: "+k+" Value: "+m.get(k));       	 
         }
         System.out.println("Using Iterator ");
         Iterator<Integer> it=keys.iterator();
         while(it.hasNext())
         {
        	 int i=it.next();
        	 System.out.println("key: "+i+" Value: "+m.get(i));
         }
	}
}
