import java.io.*;
class Variable_nacci
{
public static void main(String args[])throws IOException
{
int m,n,i,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of integers to be added -->");
m=Integer.parseInt(br.readLine());
if(m<2)
{
System.out.println("The minimum value allowed is 2 !! Try again !!");
System.exit(0);
}
System.out.println("Enter the number of integers to be printed -->");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
for(i=0;i<n;i++)
a[i]=0;
a[m-1]=1;
for(i=m;i<n;i++)
{
for(j=1;j<=m;j++)
a[i]=a[i]+a[i-j];
}
System.out.println("Required Series -->");
for(i=0;i<n;i++)
System.out.print(a[i]+"  ");
}
}