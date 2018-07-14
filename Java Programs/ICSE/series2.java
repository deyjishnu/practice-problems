//prog to calculate sum s=1+1/2!+1/3!+....+1/10!
class series2
{
public static void main(String args[])
{
int i,j,f=1;
double s=0;
for(i=1;i<=10;i++)
{
for(j=1;j<=i;j++)
f=f*j;
s+=(double)1/f;
f=1;
}
System.out.println("Sum of the series -->    "+s);
}
}