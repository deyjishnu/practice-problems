import java.io.*;
class Pay
{
String name;
float salary,hra,da,gross;
public void inputdata()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the name");
name=br.readLine();
System.out.println("Enter the salary");
salary=Float.parseFloat(br.readLine());
}
public void calculate()
{
da=(float)(salary*0.15);
hra=(float)(salary*.10);
gross=salary+da+hra;
}
public void outputdata()
{
System.out.println("Informations about the Employee");
System.out.println("--------------------------------");
System.out.println("Name                   :"+name);
System.out.println("Salary                 :Rs."+salary);
System.out.println("Dearness Allowance     :Rs."+da);
System.out.println("Home Rent Allowance    :Rs."+hra);
System.out.println("Gross                  :Rs."+gross);
}
public static void main(String args[])throws IOException
{
Pay ob=new Pay();
ob.inputdata();
ob.calculate();
ob.outputdata();
}
}