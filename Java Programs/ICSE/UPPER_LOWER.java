import java.io.*;
class UPPER_LOWER
{
public static void main(String args[])throws IOException
{
String s,s1="";
int i,len=0;
char ch=' ';
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String");
s=br.readLine();
len=s.length();
for(i=0;i<len;i++)
{
ch=s.charAt(i);
if(ch>='A' && ch<='Z')
s1=s1+Character.toLowerCase(ch);
else
s1=s1+Character.toUpperCase(ch);
}
System.out.println("******OUTPUT*******");
System.out.println(s1);
}
}