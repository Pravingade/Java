class Employee
{
    int id;
    String name;
    static String cname;
    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    static void function()
    {
        System.out.println("Static function acces static data only ");
        System.out.println("company name: "+cname);
    }
    public String toString()
    {
        return "Details: "+id+"  "+name;
    }
    static 
    {
        cname="Profound Edutech";
    }
}
public class Main
{
    static
    {
        System.out.println("This is static block which is always executed ...");
    }
    public static void main(String []args)
    {
        System.out.println("main block...");
        System.out.println(Employee.cname);
        Employee.function();
        Employee e=new Employee(101,"Pravin");
        e.cname="Profound Education Private Limited";
        System.out.println(e.cname);
        System.out.println(e);
    }
}
