//prog to calculate sum s=1+(1+2)+(1+2+3)+....+(1+2+3+...+n)
import java.io.*;
class series4
{
public void cal(int x)
{
int i,j,nu=0,de=1;
double s=0;
for(i=1;i<=x;i++)//holding series
{
for(j=1;j<=i+1;j++)//creating numerator and denominator
{
nu=nu+j;
de=de*j;
}
s=s+(double)nu/de;
nu=0;
de=1;
}
System.out.println("Sum of the series -->    "+s);
}
public static void main(String args[])throws IOException
{
int n;
series4 br=new series4();
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value of 'n' --> ");
n=Integer.parseInt(in.readLine());
br.cal(n);
}
}
