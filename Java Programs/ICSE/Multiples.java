//program to print the first three multiples of 2-5 
import java.io.*;
class Multiples
{
public static void main(String args[])throws IOException
{
int i,j;
for(i=2;i<=5;i++);
{
System.out.print(i+"=>");
for(j=1;j<=3;j++)
{
if(j<3)
System.out.print(i*j+",");
else
System.out.print(i*j+"");
}
System.out.println();
}
}
}