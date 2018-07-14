//prog. to check whether an accepted number is a prime number or not & to find its lowest factor
import java.io.*;
class Prime_Number
{
public static void main(String args[])throws IOException
{
long n=0,i,a=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no. which is to be checked whether it is prime or not:-");
n=Long.parseLong(br.readLine());
for(i=2;i<n;i++)
{
if(n%i==0)
{
a=1;
System.out.println(n+" is not a prime number.");
System.out.println("The lowest factor of "+n+" is "+i);
break;
}
}
for(i=2;i<=n;i++)
{
if(n%i==0)
a++;
}
System.out.println("The total no. of factors of "+n+" is "+(a-1));
if(a==0)
System.out.println(n+" is a prime number.");
}
}