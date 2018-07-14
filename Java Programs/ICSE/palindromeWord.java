import java.io.*;
class palindromeWord
{
public static void main(String args[])throws IOException
{
String s1,s2="";
int i,l=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the word :-");
s1=br.readLine();
l=s1.length();
for(i=l-1;i>=0;i--)
s2+=s1.charAt(i);
if(s1.equalsIgnoreCase(s2))
System.out.println(s1+" is a palindrome word.");
else
System.out.println(s1+" is not a palindrome word.");
}
}