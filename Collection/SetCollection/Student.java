package SetCollection;

public class Student
{
    int roll;
    String name;
    float per;
    public Student(int roll,String name,float per)
    {
    	super();
    	this.roll=roll;
    	this.name=name;
    	this.per=per;
    }
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", per=" + per + "]";
	}
    public int hashcode()
    {
    	return roll;
    }
    public boolean equals(Object obj)
    {
    	Student s=(Student)obj;
    	if(this.roll==s.roll)
    		return true;
    	else 
    		return false;
    }
}
