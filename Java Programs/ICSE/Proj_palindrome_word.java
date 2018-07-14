//prog. to find the palindrome words in a string
import java.io.*;
class Proj_palindrome_word
{
public static void main(String args[])throws IOException
{
String s,r="";
char d=' ';
int len=0,i,j,f=1,k=0;
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the string");
s=in.readLine();
len=s.length();
System.out.print("The palindrome words are :");
for(i=0;i<len;i++)
{
d=s.charAt(i);
if(d==' ')
{
k=r.length();
for(j=0;j<k/2;j++)
{
if(r.charAt(j)!=r.charAt(k-j-1))
f=0;
}
if(f==1)
{
System.out.print(r+"  ");
}
r="";
f=1;
k=0;
d=' ';
i=i+1;
}
r=r+s.charAt(i);
}
}
}