import java.io.*;
class Hexadecimal
{
public static void main(String args[])throws IOException
{
int x,y,a=0,b=0,c=0,k=0,i;
String s="";
long n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the  hexadecimal number -->");
n=Long.parseLong(br.readLine());
System.out.println("Enter its base -->");
x=Integer.parseInt(br.readLine());
System.out.println("Enter the required base -->");
y=Integer.parseInt(br.readLine());
do
{
for(i=0;i<4;i++)
{
a+=n%10*(Math.pow(x,k));
n=n/10;
k++;
}
System.out.println("group "+a);
System.out.println("after division "+n);
if(a==10)
s='A'+s;
else if(a==11)
s='B'+s;
else if(a==12)
s='C'+s;
else if(a==13)
s='D'+s;
else if(a==14)
s='E'+s;
else if(a==15)
s='F'+s;
else
s=a+s;
a=0;
k=0;
}
while(n>0);
System.out.println("Hexadecimal number is "+s);
}
}