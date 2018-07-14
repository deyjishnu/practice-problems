import java.io.*;  //Java Class Library
class Max_Min
{
public static void main(String args[])throws IOException  //Value Accept
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Activating buffer
int i,j,min=1,max=6,n,x,r;
n=max*10+min;
x=n;
System.out.println("Enter the no. of rows of a square matrix -->");
r=Integer.parseInt(br.readLine());
int a[][]=new int[r][r];
for(i=0;i<r-1;i++)
{
a[0][i]=x%10;
x=x/10;
if(x==0)
x=n;
}
for(i=1;i<r;i++)
{
a[i][r-1]=x%10;
x=x/10;
if(x==0)
x=n;
}
n=min*10+max;
for(i=r-1;i>0;i--)
{
a[r-1][i]=x%10;
x=x/10;
if(x==0)
x=n;
}
for(i=r-2;i>=1;i--)
{
a[i][0]=x%10;
x=x/10;
if(x==0)
x=n;
}
for(i=0;i<r;i++)
{
for(j=0;j<r;j++)
{
if(a[i][j]==0)
System.out.print("  ");
else
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
}