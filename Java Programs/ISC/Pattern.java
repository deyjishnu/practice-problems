//prog to print a pattern
import java.io.*;   //class library
class Pattern
{
int n;
public void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the limit -->");
n=Integer.parseInt(br.readLine());      //Limit accepted
}
public void display()
{
int i,j,k,sp;
for(i=1;i<=n;i++)
{
for(sp=n;sp>i;sp--)   //for creating spaces
System.out.print(" ");
for(j=1;j<=i;j++)
System.out.print(j);
for(k=i-1;k>=i;k--)
System.out.print(k);
System.out.println();
}
for(i=n-1;i>=1;i--)
{
for(sp=n;sp>i;sp--)
System.out.print(" ");   //for creating spaces
for(j=1;j<=i;j++)
System.out.print(j);
for(k=i-1;k>=i;k--)
System.out.print(k);
System.out.println();
}
}
}