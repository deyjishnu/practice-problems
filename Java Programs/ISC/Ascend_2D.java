import java.io.*;  //Java Class Library
class Ascend_2D
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r,c,i,j,k,tmp,t;
k=0;
System.out.println("Enter the no. of rows of array -->");
r=Integer.parseInt(br.readLine());
System.out.println("Enter the no. of columns of array -->");
c=Integer.parseInt(br.readLine());
t=r*c;
int a[][]=new int[r][c];
int b[]=new int[t];
System.out.println("Enter the  "+(t)+" values one by one -->");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
a[i][j]=Integer.parseInt(br.readLine());
}
System.out.println("The given 2D array -->");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
b[k]=a[i][j];
k++;
}
}
// Sorting begins
for(i=0;i<t;i++)
{
for(j=0;j<t-1-i;j++)
{
if(b[j]>b[j+1])
{
tmp=b[j];    //Interchanging values
b[j]=b[j+1];
b[j+1]=tmp;
}
}
}
k=0;
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=b[k];
k++;
}
}
System.out.println("The required ascending order -->");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
}
}