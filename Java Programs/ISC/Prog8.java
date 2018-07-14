//program to accept two words of same length and print a third word by taking one by one character from each word
import java.io.*;
class Prog8
{
public static void main(String args[])throws IOException
{
String s1,s2;
int l,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter first word -->");
s1=br.readLine();
System.out.println("Enter second word -->");
s2=br.readLine();
l=s1.length();
for(i=0;i<l;i++)
{
System.out.print(s1.charAt(i));
System.out.print(s2.charAt(i));
}
}
}