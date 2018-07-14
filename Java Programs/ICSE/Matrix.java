import java.io.*;
class Matrix
{
public static void main(String args[])
{
int i,j;
int M[][]={{-1,0,2},{-3,-1,6},{4,3,-1}};
int X[][]={{-6,9,4},{4,5,0},{1,-2,-3}};
int N[][]=new int[3][3];
//compute
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
N[i][j]=X[i][j]-M[i][j];
}
System.out.println("the values of array N are ");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
System.out.print(" "+N[i][j]);
System.out.println();
}
}
}