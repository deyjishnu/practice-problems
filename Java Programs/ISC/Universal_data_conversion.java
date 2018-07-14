import java.io.*;
class Universal_data_conversion
{
public static void main(String args[])throws IOException
{
int x,y,i,j,l,k=0,c=0,l1,l2;
long n1=0,m;
double n2=0.0,p,f;
String s,s1="",s2="",r,r1="",r2="";
char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number -->");
s=br.readLine();
l=s.length();
System.out.println("Enter its base -->");
x=Integer.parseInt(br.readLine());
System.out.println("Enter the required base -->");
y=Integer.parseInt(br.readLine());
for(i=0;i<l;i++)        //Divide the number into its integer and fractional parts
{
if(s.charAt(i)=='.')
{
s1=s.substring(0,i);
s2=s.substring(i+1,l);
k=1;
}
}
if(k==0)
s1=s;
l1=s1.length();
l2=s2.length();
for(i=l1-1;i>=0;i--)   //s1 part(Integer part)
{
for(j=0;j<16;j++)     //From given system to decimal system
{
if(s1.charAt(i)==a[j])
{
n1+=j*Math.pow(x,c);
c++;
break;
}
}
}
do                    //From decimal system to required system
{
m=n1%y;
r1=a[(int)m]+r1;
n1=n1/y;
}
while(n1>0);
if(k==0)
{
System.out.println("Answer = "+r1);
System.exit(0);
}
c=-1;                 //s2 part(Fractional part)
for(i=0;i<l2;i++)     //From given system to decimal system
{
for(j=0;j<16;j++)
{
if(s2.charAt(i)==a[j])
{
n2+=j*Math.pow(x,c);
c--;
break;
}
}
}
p=n2;                    //From decimal system to required system
do
{
p=p*y;
f=Math.floor(p);
r2=r2+a[(int)f];
p=p-f;
}
while(p>=0.01);
r=r1+'.'+r2;
System.out.println("Answer = "+r);
}
}