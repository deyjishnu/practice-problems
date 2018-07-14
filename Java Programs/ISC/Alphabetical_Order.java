//program to accept a string and display the same in alphabetical order of its letters
import java.io.*;
class Alphabetical_Order
{
public static void main(String args[])throws IOException
{
String s;
char ch;
int l,i,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string -->");
s=br.readLine();
l=s.length();
System.out.println("The characters in alphabetical order -->");
for(i=65;i<=90;i++)
{
for(j=0;j<l;j++)
{
ch=s.charAt(j);
if((int)ch==i||(int)ch==i+32)
System.out.print(ch);
}
}
}
}