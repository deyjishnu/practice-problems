//menudriven prog. to find whether a no.is perfect or palindrome
import java.io.*;
import java.util.*;
class Proj_menudriven
{
public static void main(String args[])throws IOException
{
int n,ch,i,s=0,c,r=0,d;
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Main Menu-->");
System.out.println("1. Perfect number ....");
System.out.println("2.  Palindrome no. ....");
System.out.println("3.  Exit. ....");
try
{
do
{
System.out.println("Choose your choice");
n=Integer.parseInt(in.readLine());
System.out.println("Enter the number  :");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:
for(i=1;i<=n/2;i++)
{
if(n%i==0)
s=s+i;
}
if(s==n)
System.out.println(n+" is a perfect number.");
else
System.out.println(n+" is not a perfect number.");
break;
case 2:
c=n;
do
{
d=n%10;
r=r*10+d;
n=n/10;
}
while(n!=0);
if(r==c)
System.out.println(c+" is a palindrome number.");
else
System.out.println(c+" is not a palindrome number.");
break;
case 3:
System.exit(0);
break;
default:
System.out.println("Invalid entry! Try again.");
}
}
while(true);
}
catch(Exception e)
{}
}
}