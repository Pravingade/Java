package MapCollection;
import java.util.HashMap;
import java.util.Map;

import SetCollection.Department;
import SetCollection.Student;
public class MapTest2 
{
	public static void main(String[] args) 
	{
         HashMap<Student,Department> s=new HashMap<>();
         s.put(new Student(1,"Pravin",80),new Department(102,"ENTC"));
         s.put(new Student(2,"Akshay",90),new Department(104,"IT"));
         
         for(Map.Entry<Student, Department> e:s.entrySet())
         {
        	 Student s1=e.getKey();
        	 Department d=e.getValue();
        	 System.out.println(s1);
        	 System.out.println(d);
         }
	}

}
