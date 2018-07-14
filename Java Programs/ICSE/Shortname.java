import java.io.*;
class Shortname
{
public static void main(String args[])throws IOException
{
String s,r=" ";
int a=0,i,f=0;
char d=' ';
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the full name:");
s=in.readLine();
a=s.length();
r=r+s.charAt(0);
r=r.toUpperCase();
for(i=0;i<a;i++)
{
d=s.charAt(i);
if(d==' ')
{
r=r+"."+s.charAt(i+1);
r=r.toUpperCase();
f=i;
}
}
for(i=f+2;i<a;i++)
{
r=r+s.charAt(i);
}
System.out.println("Short name:"+r);
}
}
