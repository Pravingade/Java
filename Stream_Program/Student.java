package Serialisation;

import java.io.Serializable;

public class Student implements Serializable
{
	int roll;
	String name;
    float per;
	public Student(int roll,String name,float per)
	{
		this.roll=roll;
		this.name=name;
		this.per=per;
	}
    public String toString()
    {
    	return "Roll no: "+roll+"  Name: "+name+"  Percentage: "+per;
    }
}
