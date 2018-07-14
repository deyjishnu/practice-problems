// To calculate the area of a square or rectangle as per user's choice using method call
import java.io.*;
class calculation
{
public double cal(double z)
{
return(z*z);
}
public double cal(double x,double y)
{
return(x*y);
}
public static void main(String args[])throws IOException
{
double l,b,s;
double area;
int a;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter '1' to calculate the area of a square or '2' to calculate the area of a rectangle :-");
a=Integer.parseInt(br.readLine());
calculation obj=new calculation();
if(a==1) //To calculate the area of square
{
System.out.println("Enter the side :-");
s=Double.parseDouble(br.readLine());
area=obj.cal(s); //Calling Method
System.out.println("Area of Square="+area+" sq.units");
}
if(a==2) //To calculate the area of rectangle
{
System.out.println("Enter the length :-");
l=Double.parseDouble(br.readLine());
System.out.println("Enter the breadth :-");
b=Double.parseDouble(br.readLine());
area=obj.cal(l,b); //Calling Method
System.out.println("Area of Rectangle="+area+" sq.units");
}
}
}