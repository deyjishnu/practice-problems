import java.io.*;
class Bank
{
public static void main(String args[])throws IOException
{
String s;
int a[]=new int[10];
double b[]=new double[10];
String c[]=new String[10];
int i=0,j=0,n,m,f,k=0;
double tmp,bal=0.0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(i=0;i<=2;i++)
{
System.out.println("Please enter password to create and access user accounts -->");
s=br.readLine();
if(s.equals("qwerty"))
break;
else
{
System.out.println("Wrong password !!");
k++;
}
}
if(k==3)
{
System.out.println("3 attempts done !!");
System.exit(0);
}
System.out.println("    ....... MAIN MENU......");
System.out.println("..... 1 CREATE NEW ACCOUNT......");
System.out.println("..... 2 DEPOSIT......");
System.out.println("..... 3 WITHDRAWAL......");
System.out.println("..... 4 EXIT ......");
do
{
System.out.print("Please enter your option  : ");
n=Integer.parseInt(br.readLine());
switch(n)
{
case 1:  //CREATE NEW ACCOUNT
System.out.print("Please enter new account number : ");
a[i]=Integer.parseInt(br.readLine());
System.out.print("Please enter initial amount: Rs.");
b[i]=Double.parseDouble(br.readLine());
if(b[i]<500)
{
System.out.println("Invalid !! Initial amount must be atleast Rs.500");
break;
}
System.out.print("Please enter name of account holder : ");
c[i]=br.readLine();
i++;
break;
case 2:  //DEPOSIT 
f=0;
System.out.print("Please enter account number : ");
m=Integer.parseInt(br.readLine());
for(j=0;j<i;j++)
{
if(m==a[j])
{
System.out.print("Please enter deposit money : Rs.");
bal=Double.parseDouble(br.readLine());
b[j]=b[j]+bal;
f++;
System.out.println(" Name of the account holder : "+c[j]);
System.out.println("Final amount = Rs."+b[j]);
break;
}
}
if(f==0)
System.out.println("Invalid account number ");
break;
case 3:  //WITHDRAWAL 
f=0;
System.out.print("Please enter account number : ");
m=Integer.parseInt(br.readLine());
for(j=0;j<i;j++)
{
if(m==a[j])
{
tmp=b[j];
System.out.print("Please enter withdrawal money : Rs.");
bal=Double.parseDouble(br.readLine());
b[j]=b[j]-bal;
f++;
System.out.println("Name of the account holder : "+c[j]);
if(b[j]>=500)
System.out.println("Final amount = Rs."+b[j]);
else
{
System.out.println(c[j]+" cannot withdraw Rs."+bal);
System.out.println("Atmost Rs."+(b[j]+bal-500)+" can be withdrawn.");
b[j]=tmp;
}
break;
}
}
if(f==0)
System.out.println("Invalid account number !!");
break;
case 4:
System.exit(0);
break;
default:
System.out.println("Invalid option ! Try again !!!");
}
}
while(true);
}
}