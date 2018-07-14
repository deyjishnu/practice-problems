import java.io.*;
class Rectangle
{
int l,b,a,p;
double d;
public void inputdata()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the length");
l=Integer.parseInt(br.readLine());
System.out.println("Enter the breadth");
b=Integer.parseInt(br.readLine());
}
public void calculate()
{
a=l*b;
p=2*(l+b);
d=Math.sqrt(l*l+b*b);
}
public void outputdata()
{
System.out.println("Area  =  "+a);
System.out.println("Perimeter  =  "+p);
System.out.println("Diagonal  =  "+d);
}
public static void main(String args[])throws IOException
{
Rectangle ob=new Rectangle();
ob.inputdata();
ob.calculate();
ob.outputdata();
}
}