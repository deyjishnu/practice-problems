import java.io.*;
class String_Transformation2
{
public static void main(String args[])throws IOException
{
String s;
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
if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
{
s=s.replace(ch,'*');
}
}
System.out.println(s);
}
}