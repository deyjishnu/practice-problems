//program to accept a sentence and convert all the articles- 'a' to 'an'.
import java.io.*;
class Prog4
{
public static void main(String args[])throws IOException
{
String s,w="",s1="";
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
if((w.compareTo("a"))==0)
s1=s1+" "+"an";
else
{
s1=s1+" "+w;
}
w="";
}
}
System.out.println("The new String --> "+s1);
}
}