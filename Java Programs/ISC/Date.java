//program to find the difference between two entered dates
import java.io.*;
class Date
{
String s;
int d,m,y;
public void manager()throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Date s1=new Date();
Date s2=new Date();
System.out.println("Enter the first date -->");
s1.s=br.readLine();
System.out.println("Enter the second date -->");
s2.s=br.readLine();
s1.extract();
s2.extract();
if(s2.d>s1.d)
{
s1.d=s1.d+30;
s1.m--;
}
if(s2.m>s1.m)
{
s1.m=s1.m+12;
y--;
}
if(s2.y>s1.y)
{
System.out.println("The first date should be greater than the second one !!");
System.exit(0);
}
a=s1.d-s2.d;
b=s1.m-s2.m;
c=s1.y-s2.y;
System.out.print("The difference is --> "+c+" years, "+b+" months and "+a+" days.");
}
public int con(String a)
{
return(Integer.parseInt(a));
}
public void extract()
{
this.d=con(this.s.substring(0,2));
this.m=con(this.s.substring(3,5));
this.y=con(this.s.substring(6,10));
}
public static void main()throws IOException
{
Date ob=new Date();
ob.manager();
}
}