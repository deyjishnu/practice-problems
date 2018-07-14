//S=1/1!+1/2!+1/3!+.........UPTO N TERMS
import java.io.*;
class Factorial
{
public static void main(String args[])throws IOException
{
int n,i,f;
double s=0.0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no. whose factorial is to be calculated");
n=Integer.parseInt(br.readLine());
Factorial ob=new Factorial();
for(i=1;i<=n;i++)
{
f=ob.fact(i);
s=s+(double)1/f;
}
System.out.println("sum of series upto "+n+" terms= "+s);
}
int fact(int n)//FOR CALCULATION OF FACTORIAL
{
int i,f=1;
for(i=n;i>1;i--)
f=f*i;
return(f);
}
}