import java.io.*;
class Country
{
public static void main(String args[])throws IOException
{
String country[]=new String[3];
String capital[]=new String[3];
String a="";
int flag=0;
int i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(i=0;i<3;i++)
{
System.out.print("Enter the name of country");
System.out.println();
country[i]=br.readLine();
System.out.print("Enter the name of capital ");
capital[i]=br.readLine();
System.out.println();
}
System.out.println("enter the name of specified country ");
a=br.readLine();
for(i=0;i<3;i++)
{
if(country[i].compareTo(a)==0)
{
System.out.print("the corresponding capital is  "+capital[i]);
flag=1;
break;
}
}
if(flag==0)
System.out.println("error input try next time ");
}
}