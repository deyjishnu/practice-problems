//program to accept a string and count the number of special characters in it
import java.io.*;
class Prog10
{
public static void main(String args[])throws IOException
{
String s;
char ch;
int l,i,k=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string -->");
s=br.readLine();
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(!(Character.isLetter(ch)||Character.isDigit(ch)))
k++;
}
System.out.println("No. of special characters in the string is "+k);
}
}