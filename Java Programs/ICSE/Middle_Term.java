//prog. to calculate the middle term by Sridhar Acharya's formula
import java.io.*;
import java.math.*;
class Middle_Term
{
public static void main(String args[])throws IOException
{
double a,b,c,x=0.0,y=0.0,sr=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("In the form of expression:- ax^2+bx+c,");
System.out.println("Enter the value of 'a':");
a=Double.parseDouble(br.readLine());
System.out.println("Enter the value of 'b':");
b=Double.parseDouble(br.readLine());
System.out.println("Enter the value of 'c':");
c=Double.parseDouble(br.readLine());
sr=Math.sqrt(b*b-4*a*c);
x=(-b+sr)/2*a;
y=(-b-sr)/2*a;
System.out.println("The roots are=   "+x);
System.out.println("The roots are=   "+y);
}
}