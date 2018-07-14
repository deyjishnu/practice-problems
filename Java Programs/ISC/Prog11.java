//program to accept a string and print it in toggle case
import java.io.*;
class Prog11
{
public static void main(String args[])throws IOException
{
String s,s1="";
char ch,ch1;
int l,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string -->");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(Character.isUpperCase(ch))
ch1=Character.toLowerCase(ch);
else
ch1=Character.toUpperCase(ch);
s1=s1+ch1;
}
System.out.println("The new string in toggle case -->");
System.out.println(s1);
}
}