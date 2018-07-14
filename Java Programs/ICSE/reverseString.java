import java.io.*;
class reverseString
{
public static void main(String args[])throws IOException
{
int i,l=0;
String s1,s2="";
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String to be reversed");
s1=br.readLine();
//picking up each character from the string
l=s1.length();
for(i=l-1;i>=0;i--)
s2=s2+s1.charAt(i);
System.out.println("the reverse string  :"+s2);
}
}


