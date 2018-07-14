import java.io.*;
class Discount1
{
public static void main(String args[])throws IOException
{
//double a,b,c,mp,d,sp;

int a[]=new int[20];
double mp=0,sp,d;
int i=0,k=1;
char ch=' ';
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//System.out.println("Enter the price of 3 purchased goods");
//a=Double.parseDouble(br.readLine());
//b=Double.parseDouble(br.readLine());
//c=Double.parseDouble(br.readLine());
do
{
System.out.println("enter price ");
a[i]=Integer.parseInt(br.readLine());
mp=mp+a[i];
System.out.println("Do you want to continue ?");
ch=(char)(br.read());
k++;
i++;
}
while(i<20||ch=='y');
//mp=a+b+c;
if(mp<=5000)
d=mp*0.05;
else
if(mp<=10000)
d=mp*0.10;
else
if(mp<=20000)
d=mp*0.15;
else
d=mp*0.20;
sp=mp-d;
System.out.println("Discount=Rs."+d);
System.out.println("Selling Price=Rs."+sp);
}
}