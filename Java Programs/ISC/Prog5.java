//program to accept a word and display the same in alphabetical order of its letters
import java.io.*;
class Prog5
{
public static void main(String args[])throws IOException
{
String s,s1="";
char ch;
int l,i,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a word -->");
s=br.readLine();
l=s.length();
for(i=65;i<=90;i++)
{
for(j=0;j<l;j++)
{
ch=s.charAt(j);
if(((int)ch==i)||((int)ch==(i+32)))
s1=s1+ch;
}
}
System.out.println("The letters of the word in alphabetical order -->"+s1);
}
}