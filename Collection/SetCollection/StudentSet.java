package SetCollection;

import java.util.LinkedHashSet;
import java.util.Set;

public class StudentSet 
{
	public static void main(String[] args)
	{
         Set<Student> Sset=new LinkedHashSet<>();
         Sset.add(new Student(101,"AAAA",70));
         Sset.add(new Student(102,"BBBB",67));
         Sset.add(new Student(103,"CCCC",34));
         Sset.add(new Student(104,"DDDD",80));
         Sset.add(new Student(105,"EEEE",89));
        for(Student s:Sset)
        {
        	System.out.println(s);
        }
        if(Sset.contains(new Student(103,"CCCC",34)))
        {
        	System.out.println("Found.");
        }
        else
        {
        	System.out.println("Not Found.");
        }
	}

}
