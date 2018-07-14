import java.io.*;
class employee
{
double basic=0,da=0,hra=0,pf=0,np=0,gp=0;
public void cal(double basic)
{
da=25.0/100.0*basic;
hra=15.0/100.0*basic;
pf=8.33/100.0*basic;
np=basic+da+hra;
gp=np-pf;
}
public void display()
{
System.out.println("Dearness Allowance=Rs."+da);
System.out.println("Home Rent Allowance=Rs."+hra);
System.out.println("Provident Fund=Rs."+pf);
System.out.println("Net Pay=Rs."+np);
System.out.println("Gross Pay=Rs."+gp);
}
public static void main(String args[])throws IOException
{
double ba=0;
employee br=new employee();
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter value of basic :-");
ba=Double.parseDouble(in.readLine());
br.cal(ba);
br.display();
}
}