//program to display a number triangle
import java.io.*;
class Number_Triangle
{
public static void main(String args[])throws IOException
{
int i,j,n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter range...........");
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
System.out.print(" "+(i*j));
System.out.println();
}
}
}