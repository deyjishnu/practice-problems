import java.io.*;
class Age
{
public static void main(String args[])throws IOException
{
int n,i,s1=0,s2=0,s3=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no. of employees:-");
n=Integer.parseInt(br.readLine());
int a[]=new int [n];
System.out.println("Enter the ages of the "+n+" employees:-");
for(i=0;i<n;i++)
{
System.out.print((i+1)+".");
a[i]=Integer.parseInt(br.readLine());
if(a[i]>=26 && a[i]<=35)
s1++;
if(a[i]>=36 && a[i]<=45)
s2++;
if(a[i]>=46 && a[i]<=55)
s3++;
}
System.out.println(">>The no. of employees of age between 26 to 35="+s1);
System.out.println(">>The no. of employees of age between 36 to 45="+s2);
System.out.println(">>The no. of employees of age between 46 to 55="+s3);
}
}