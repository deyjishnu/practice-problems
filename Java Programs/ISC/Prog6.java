//program to accept a sentence and find the frequency of an accepted word
import java.io.*;
class Prog6
{
public static void main(String args[])throws IOException
{
String s,s1,w="";
char ch;
int l,i,k=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence -->");
s=br.readLine();
System.out.println("Enter the word to be searched -->");
s1=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch!=' ')
w=w+ch;
else
{
if(w.equals(s1))
k++;
w="";
}
}
System.out.println("The frequency of the word '"+s1+"' is "+k);
}
}