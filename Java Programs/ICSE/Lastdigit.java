import java.io.*;
class Lastdigit
{
public static void main(String args[])throws IOException
{
int i,d,s=0;
int a[]=new int[10];  
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the 10 numbers: ");
for(i=0;i<10;i++)
a[i]=Integer.parseInt(in.readLine());
System.out.print("last digits   ");
for(i=0;i<10;i++)
{
d=a[i]%10;
if(i==9)
System.out.print(d);
else
System.out.print(d+"+");
s=s+d;
}
System.out.println();
System.out.println("The sum of the last digit of the 10 numbers= "+s);
}
}