import java.io.*;
class sales
{
public static void main(String args[])throws IOException
{
int i;
double a[]=new double[5];//sale amount 
double b[]=new double[5];//total income 
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the sale amount of 5 Salesman --->");
for(i=0;i<5;i++)
{
a[i]=Double.parseDouble(br.readLine());
if(a[i]<=5000)
b[i]=1500;
else
if(a[i]<=10000)
b[i]=a[i]*.12+1500;
else
if(a[i]<=15000)
b[i]=a[i]*.15+1500;
else
b[i]=a[i]*.18+1500;
}
System.out.println("Sale Person       Sale Amount           Commission           Total Income");
System.out.println("===========      =============           ===========        =============");
for(i=0;i<5;i++)
{
System.out.println((i+1)+"               "+a[i]+"                   "+(b[i]-1500)+"                   "+b[i]);
System.out.println("----------------------------------------------------------------------------------------");
}
}
}
