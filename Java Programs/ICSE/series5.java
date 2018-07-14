//prog. to calculate sum s=2-4+6-8+10....-20
class series5
{
public static void main(String args[])
{
int i;
double s=0;
for(i=2;i<=20;i+=2)
{
if(i%4==0)
s=s-i;
else
s=s+i;
}
System.out.println("Sum of the series -->  "+s);
}
}