//prog to print a filled triangle using a character
import java.io.*;   //class library
class Filled_Triangle
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
int i,j,k;
for(i=1;i<=n;i++)
{
for(k=1;k<=n-i;k++)   //for creating spaces
System.out.print(" ");
for(j=1;j<=2*i-1;j++)
System.out.print('a');
System.out.println();
}
}
}