import java.io.*;
class Multiplication_Table
{
public static void main(String args[])throws IOException
{
int i,n,j,s;//variable 's' is taken only because of some problems occuring in this computer
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of which multiplication tables will be displayed");
n=Integer.parseInt(br.readLine());
s=n-1;
for(i=1;i<=s;i++);
{
for(j=1;j<=10;j++)
System.out.print(i*j+"  ");
System.out.println();
}
}
}