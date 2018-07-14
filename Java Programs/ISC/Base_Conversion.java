import java.io.*;
class Base_Conversion
{
public static void main(String args[])throws IOException
{
int x,y,i,j,l,k,c=0,m,n=0;
String s,r="";
char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number -->");
s=br.readLine();
l=s.length();
System.out.println("Enter its base -->");
x=Integer.parseInt(br.readLine());
System.out.println("Enter the required base -->");
y=Integer.parseInt(br.readLine());
for(i=l-1;i>=0;i--)
{
for(j=0;j<16;j++)
{
if(s.charAt(i)==a[j])
{
n+=j*Math.pow(x,c);
c++;
break;
}
}
}
do
{
m=n%y;
r=a[m]+r;
n=n/y;
}
while(n>0);
System.out.println(s+" in base "+y+" = "+r);
}
}