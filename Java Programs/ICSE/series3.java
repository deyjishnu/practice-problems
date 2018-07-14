//S=1+X^2/1!+X^3/2!.......+X^10/9!
import java.io.*;
class series3
{
public void cal(int x)
{
int i,j,f=1;
double s=1;
for(i=1;i<=9;i++)
{
for(j=1;j<=i;j++)
f=f*j;
s+=(double)Math.pow(x,(i+1))/f;
f=1;
}
System.out.println("Sum of the series -->    "+s);
}
public static void main(String args[])throws IOException
{
int n;
series3 br=new series3();
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the value of 'x' --> ");
n=Integer.parseInt(in.readLine());
br.cal(n);
}
}
