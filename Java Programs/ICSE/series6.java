import java.io.*;
class series6
{
public static void main(String args[])throws IOException
{
int i,j,x,f=1;
double s=1.0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value of 'x' -->");
x=Integer.parseInt(br.readLine());
for(i=1;i<=9;i++)
{
for(j=1;j<=i;j++)
{
f*=j;
}
s+=(double)(Math.pow(x,i+1)/f);
}
System.out.println("Sum of the Series  --->"+s);
}
}