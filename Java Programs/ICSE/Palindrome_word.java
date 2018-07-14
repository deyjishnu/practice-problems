import java.io.*;
class Palindrome_word
{
public static void main(String args[])throws IOException
{
String s,m=" ",r=" ";
int a=0,b=0,i,j;
char d=' ';
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the full string:");
s=in.readLine();
a=s.length();
//System.out.println("enter the second string ");
//m=in.readLine();
b=m.length();
for(i=0;i<a;i++)
{
for(j=b+i-1;j>=i;j--)
{
r=r+s.charAt(j);
}
if(r==m)
System.out.println("no of occurance  "+r);
}
}
}