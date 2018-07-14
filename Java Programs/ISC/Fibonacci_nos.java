import java.io.*;  //Java Class Library
class Fibonacci_nos
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Activating buffer
int n,r,c,i,j,f1=-1,f2=1,f3;
System.out.println("Enter the number of fibonacci numbers -->");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the no. of rows of array -->");
r=Integer.parseInt(br.readLine());
System.out.println("Enter the no. of columns of array -->");
c=Integer.parseInt(br.readLine());
if(!((r==c)&&(n==r*c)&&(r%2==1)))
{
System.out.println("ERROR !! Try Again.");
System.exit(0);
}
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
f3=f1+f2;
a[i][j]=f3;
f1=f2;
f2=f3;
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]<10)
System.out.print(" "+a[i][j]+" ");
else
System.out.print(a[i][j]+" ");
}
System.out.println();
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
if(a[i][j]<10)
System.out.print(" ");
if(i+j>=r)
System.out.print(a[i][j]+" ");
else
System.out.print(" ");
}
System.out.println();
}
}
}