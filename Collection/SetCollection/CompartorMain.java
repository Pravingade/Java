package SetCollection;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorMain 
{
   public static void main(String [] args)
   {
	   TreeSet<Department> dset=new TreeSet<>();
	   dset.add(new Department(101,"ETC"));
	   dset.add(new Department(102,"civil"));
	   dset.add(new Department(103,"IT"));
	   dset.add(new Department(104,"MECH"));

	   Iterator<Department> it=dset.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
   }
}
