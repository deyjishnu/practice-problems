//prog to print a hollow triangle using a character
import java.io.*;   //class library
class Hollow_Triangle
{
int n;
public void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of rows -->");
n=Integer.parseInt(br.readLine());      //Limit accepted
}
public void display()
{
int i,j,k,l;
for(i=1;i<=n;i++)
{
for(k=1;k<=n-i;k++)   //for creating leading spaces
System.out.print(" ");
if((i==1)||(i==n))
{
for(j=1;j<=2*i-1;j++)
System.out.print('a');
}
else
{
System.out.print('a');
for(l=1;l<=2*i-3;l++)   //for creating middle spaces
System.out.print(" ");
System.out.print('a');
}
System.out.println();
}
}
}