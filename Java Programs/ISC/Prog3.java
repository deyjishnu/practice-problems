//program to accept a word and check whether it is a palindrome word or not
import java.io.*;
class Prog3
{
public static void main(String args[])throws IOException
{
String s,r;r="";
int l,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a word -->");
s=br.readLine();
l=s.length();
for(i=l-1;i>=0;i--)
r=r+s.charAt(i);
if(s.equals(r))
System.out.println(s+" is a palindrome word");
else
System.out.println(s+" is not a palindrome word");
}
}