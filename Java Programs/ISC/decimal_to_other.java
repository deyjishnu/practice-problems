//Accept a decimal number and convert it into its binary, octal or hexadecimal equivalent, according to the user's choice
import java.io.*;
class decimal_to_other
{
int n,y,b,k=0,m=0;
String s="";
public void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number in base 10 -->");
n=Integer.parseInt(br.readLine());           //Accept the no. in decimal
System.out.println("Enter the required base -->");
y=Integer.parseInt(br.readLine());           //Accept the required base
}
public void display()
{
char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
if(y==16)              //To convert in hexadecimal
{
do
{
b=n%y;
s=a[b]+s;
n=n/y;
}
while(n>0);
System.out.println("result in hexadecimal ="+s);
}
else
{
do            //To convert into other bases
{
b=n%y;
m+=(n%y)*Math.pow(10,k);
k++;
n=n/y;
}
while(n>0);
if(y==2)
System.out.println("result in binary= "+m);
else
System.out.println("result in octal= "+m);
}
}
}