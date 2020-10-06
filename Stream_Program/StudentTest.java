package Serialisation;

import java.io.*;


public class StudentTest
{
	public static void main(String[] args) throws FileNotFoundException,IOException,ClassNotFoundException
	{
        Student s1=new Student(101,"aaa",78.80f);
        Student s2=new Student(102,"bbb",98.60f);
        File f=new File("Test/f6.txt");
        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream(f));
        os.writeObject(s1);
        os.writeObject(s2);
        os.close();
        
        ObjectInputStream is=new ObjectInputStream(new FileInputStream(f));
        Student s11=(Student)is.readObject();
        Student s12=(Student)is.readObject();
        is.close();
        System.out.println(s11);
        System.out.println(s12);

	}
}
