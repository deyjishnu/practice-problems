//program to accept a string and find the number of vowels in it
import java.io.*;
class Prog2
{
public static void main(String args[])throws IOException
{
String s;
char ch;
int l,i,k;k=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string -->");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
k++;
}
System.out.println("No. of vowels present in the string= "+k);
}
}