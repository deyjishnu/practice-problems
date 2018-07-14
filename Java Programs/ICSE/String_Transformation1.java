import java.io.*;
class String_Transformation1
{
public static void main(String args[])throws IOException
{
String s,p=" ";
int i,len=0;
char ch=' ';
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String");
s=br.readLine();
System.out.println("The transformed string as specified is below :-");
len=s.length();
for(i=0;i<len;i++)
{
ch=s.charAt(i);
if(ch==' ')
{
p=s.replace(' ','+');
}
}
System.out.println(p);
}
}