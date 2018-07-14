import java.io.*;
class Data_Conversion
{
public static void main(String args[])throws IOException
{
int n,x,y,a=0,b=0,c=0,k=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number -->");
n=Integer.parseInt(br.readLine());
System.out.println("Enter its base -->");
x=Integer.parseInt(br.readLine());
System.out.println("Enter the required base -->");
y=Integer.parseInt(br.readLine());
do             //Conversion to Decimal System
{
a+=n%10*(Math.pow(x,k));
n=n/10;
k++;
}
while(n>0);
do             //Succesive Division  by required base
{
b=b*10+a%y;
a=a/y;
}
while(a>0);
do             //Reverse
{
c=c*10+b%10;
b=b/10;
}
while(b>0);
System.out.println("The number in base '"+y+"' = "+c);
}
}