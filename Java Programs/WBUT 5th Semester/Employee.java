import java.io.*;
class Employee
{
    protected String name;
    protected int age;
    Employee(String s,int a)
    {
        name=s;
        age=a;
    }
    void display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
    }
}
class Worker extends Employee
{
    int hoursWorked,salaryPerHour;
    Worker(String s,int a,int hw,int sph)
    {
        super(s,a);
        hoursWorked=hw;
        salaryPerHour=sph;
    }
    void cal()
    {
        System.out.println("Total Salary : Rs."+(hoursWorked*salaryPerHour));
    }
}
class Manager extends Employee
{
    String department;
    int salary;
    Manager(String s,int a,String d,int sal)
    {
        super(s,a);
        department=d;
        salary=sal;
    }
    void cal()
    {
        System.out.println("Salary of Manager is Rs"+salary);
    }
}
class Demo
{
    public static void main(String args[])throws IOException
    {
        String s,d;
        int a,hw,sph,sal;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter name -->");
        s=br.readLine();
        System.out.println("Enter age -->");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter department -->");
        d=br.readLine();
        System.out.println("How many hours he/she worked ?");
        hw=Integer.parseInt(br.readLine());
        System.out.println("Enter the salary per hour -->");
        sph=Integer.parseInt(br.readLine());
        System.out.println("Enter the salary of Manager-->");
        sal=Integer.parseInt(br.readLine());
        Worker ob1=new  Worker(s,a,hw,sph);
        Manager ob2=new Manager(s,a,d,sal);
        ob1.display();
        ob1.cal();
        ob2.cal();
    }
}