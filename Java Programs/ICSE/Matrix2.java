//WAP to add values of each column & rows & diagonals
import java.io.*;
class Matrix2
{
public static void main(String args[])throws IOException
{
int i,j,r=0,c=0,ld=0,rd=0,t=2;
int m[][]=new int[3][3];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter values of 3*3 matrix");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
m[i][j]=Integer.parseInt(br.readLine());
}
}
System.out.println("values in matrix form ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(m[i][j]+" ");
}
System.out.println();
}
//sum of rows
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
r=r+m[i][j];
}
System.out.println("total values of a "+(i+1)+" row = "+r);
r=0;
}
//sum of columns
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c=c+m[j][i];
}
System.out.println("total values of a "+(i+1)+" column = "+c);
c=0;
}
//sum of left diagonal 
for(i=0;i<3;i++)
{
ld=ld+m[i][i];
}
System.out.println("total values of left diagonal = "+ld);
//sum of right diagonal
for(i=0;i<3;i++)
{
rd=rd+m[i][t];
t--;
}
System.out.println("total values of right diagonal = "+rd);
}
}