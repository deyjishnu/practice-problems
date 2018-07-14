import java.io.*;
class Jishnu1
{
public static void main(String args[])throws IOException
{
int i,sum;sum=0;
int a[]={5,6,7,8,4,3,9};
for(i=0;i<7;i++)
{
if(i==3)
sum+=a[i];
if(i==4)
sum+=a[i];
}
System.out.println("Sum="+sum);
}
}