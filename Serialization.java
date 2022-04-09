import java.io.Serializable;
import java.io.*;

 class Student implements Serializable
{
    int roll;
    String name;
     Float per;
    public Student (int roll,String name,Float per)
    {
        this.roll=roll;
        this.name=name;
        this.per=per;
    }
    public String toString()
    {
        return roll+" "+name+" "+per;
    }
}


public class Main
{
    public static void main (String[] args) throws FileNotFountException ,IOException,classNotFoundException
    {
       Student s1=new Student(101,"Pravin",78.09f);
       Student s2=new Student(102,"Akshay",90.12f);
       file f=new file("Test/Obj.txt");
       ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(f));
       os.writeObject(s1);
       os.writeObject(s2);
       os.Close();
       ObjectInputStream is=new ObjectInputStream(new FileinputStream(f));
       Student s11=(Student)is.readObject();
       Student s12=(Student)is.readObject();
       is.close();
       System.out.println(s11);
       System.out.println(s12);
       
        
    }
}
