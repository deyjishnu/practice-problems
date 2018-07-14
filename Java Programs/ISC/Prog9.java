//program to accept a sentence and display the same in reversed order
import java.io.*;
class Prog9
{
public static void main(String args[])throws IOException
{
String s,s1="",w="";
char ch;
int l,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence -->");
s=br.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch!=' ')
w=w+ch;
else
{
s1=w+" "+s1;
w="";
}
}
System.out.println("The String in reversed order -->");
System.out.println(s1);
}
}