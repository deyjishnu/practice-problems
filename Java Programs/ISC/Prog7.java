//program to accept a word and display the word in Pig Latin Form
import java.io.*;
class Prog7
{
public static void main(String args[])throws IOException
{
String s,s1;
char ch;
int l,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a word -->");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
break;
}
s1=s.substring(i,l)+s.substring(0,i)+"ay";
System.out.println("The Pig Latin Form of the given word -->"+s1);
}
}