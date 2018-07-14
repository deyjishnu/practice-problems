import java.io.*;
class Programming_Calculator
{
public String conversion(String s,int x,int y)
{
int i,j,l,k=0,c=0,l1,l2;
int n1=0,m;
double n2=0.0,p,f;
String s1="",s2="",r,r1="",r2="";
char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
l=s.length();
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
return r1;
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
return r;
}
public void manager()throws IOException
{
int u,v,ch;
double g,h;
String str1,str2,str3;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("............MENU..............");
System.out.println("       1.Conversion");
System.out.println("       2.Addition");
System.out.println("       3.Substraction");
System.out.println("       4.Multiplication");
System.out.println("       5.Division");
System.out.println();
System.out.println("Enter your choice --> ");
ch=Integer.parseInt(br.readLine());
if(ch==1)  //Conversion
{
System.out.println("Enter the number --> ");
str1=br.readLine();
System.out.println("Enter its base --> ");
u=Integer.parseInt(br.readLine());
System.out.println("Enter the required base --> ");
v=Integer.parseInt(br.readLine());
str2=conversion(str1,u,v);
System.out.println("Answer = "+str2);
}
else  //Other Operations
{
System.out.println("Enter the base --> ");
u=Integer.parseInt(br.readLine());
System.out.println("Enter the first number --> ");
str1=br.readLine();
System.out.println("Enter the second number --> ");
str2=br.readLine();
g=Double.parseDouble(conversion(str1,u,10));
h=Double.parseDouble(conversion(str2,u,10));
switch(ch)
{
case 2:  //Addition
str3=conversion((Double.toString(g+h)),10,u);
System.out.println(str1+" + "+str2+" = "+str3);
break;
case 3:  //Substraction
str3=conversion((Double.toString(g-h)),10,u);
System.out.println(str1+" - "+str2+" = "+str3);
break;
case 4:  //Multiplication
str3=conversion((Double.toString(g*h)),10,u);
System.out.println(str1+" * "+str2+" = "+str3);
break;
case 5:  //Division
str3=conversion((Double.toString(g/h)),10,u);
System.out.println(str1+" / "+str2+" = "+str3);
break;
default:
System.out.println("Wrong choice !! Try again");
}
}
}
}