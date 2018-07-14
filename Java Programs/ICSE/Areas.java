//program to find the areas of circle,square or rectangle as per the User's choice
import java.io.*;
class Areas
{
public static void main(String args[])throws IOException
{
int ch=0;
double r=0.0,s=0.0,l=0.0,b=0.0,a=0.0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println(">Type '1' to find the area of a circle,'2' for a square and '3' for a rectangle.");
System.out.println(">Type '4' to exit.");
do
{
System.out.println("Enter your choice:-");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
{
System.out.println("Enter the length of the radius : ");
r=Double.parseDouble(br.readLine());
a=3.14*r*r;
System.out.println("Area = "+a+"sq.units");
System.out.println();
}
break;
case 2:
{
System.out.println("Enter the length of each side : ");
s=Double.parseDouble(br.readLine());
a=s*s;
System.out.println("Area = "+a+"sq.units");
System.out.println();
}
break;
case 3:
{
System.out.println("Enter the length : ");
l=Double.parseDouble(br.readLine());
System.out.println("Enter the breadth : ");
b=Double.parseDouble(br.readLine());
a=l*b;
System.out.println("Area = "+a+"sq.units");
System.out.println();
}
break;
case 4:
System.out.println("The loop has exitted");
System.exit(0);
break;
default:
System.out.println("Wrong Entry!!Try again.");
System.out.println();
}
}
while(true);
}
}