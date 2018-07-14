//program to count the no. of occurence of a particular no. in an array containing 20 elements;
import java.io.*;
class sqpattern
{
public static void main(String args[])throws IOException
{
int i,j,l=0,u=5;
int a[]=new int[5];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the 5 numbers  ");
for(i=0;i<u;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("display numbers in square form    ");
for(i=0;i<u-1;i++)
{
System.out.print(a[i]);
for(j=0;j<u-2;j++)
System.out.print(" ");
System.out.print(a[u-i-1]);
System.out.println();
}
for(i=u-1;i>=0;i--)
System.out.print(a[i]);
}
}



