//program to sort a two dimensional array in ascending order
import java.io.*;  //Java Class Library
class Two_D_Array_sorting
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r,c,i,j,s,p,q,m,n,min,tmp;
System.out.println("Enter the no. of rows of matrix -->");
r=Integer.parseInt(br.readLine());
System.out.println("Enter the no. of columns of matrix -->");
c=Integer.parseInt(br.readLine());
int a[][]=new int[r][c];
System.out.println("Enter the  "+(r*c)+" values one by one -->");
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
//Sorting Begins
s=p=q=0;
do
{
if(q>=c)
{
p++;
q=0;
}
min=a[p][q];
m=p;
n=q;
i=p;
for(j=q;i<r &&j<c;)
{
if(min>a[i][j])
{
min=a[i][j];
m=i;n=j;
}
j++;
if(j>=c)
{
i++;
j=0;
}
}
tmp=a[p][q];
a[p][q]=a[m][n];
a[m][n]=tmp;
q++;
s++;
}
while(s<r*c);
System.out.println("The sorted 2D array -->");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
}
}