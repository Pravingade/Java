package SetCollection;

    public class Department implements Comparable <Department>
    {
    	int did;
    	String name;
    	public Department(int did,String name)
    	{
    		super();
    		this.did=did;
    		this.name=name;
    	}
        public String toString()
        {
        	return "Department [ did= "+did+" dname= "+name+" ]";
        }
        public int compareTo(Department d)
        {
        	if(this.did<did)
        	{
        		return -1;
        	}
        	else
        		return 0;
        }
    }

