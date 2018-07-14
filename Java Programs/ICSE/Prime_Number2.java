//prog. to check whether an accepted number is a prime number or not & to find its lowest factor
import java.io.*;
class Prime_Number2
{
public static void main(String args[])throws IOException
{
long x=0,y=0,i,a=0,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the lowest no.-->");
x=Long.parseLong(br.readLine());
System.out.println("Enter the highest no.-->");
y=Long.parseLong(br.readLine());
System.out.println("The prime nos.are-->");
for(j=x;j<=y;j++)
{
for(i=2;i<(j/2);i++)
{
if(j%i==0)
{
a++;
break;
}
}
if(a==0)
System.out.println(j);
}
}
}
