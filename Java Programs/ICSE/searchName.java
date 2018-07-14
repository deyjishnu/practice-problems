import java.io.*;
class searchName
{
public static void main(String args[])throws IOException
{
int i;
char ch;
String s[]=new String[5];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 5 names -->");
for(i=0;i<5;i++)
s[i]=br.readLine();
System.out.println("Enter the first letter -->");
ch=(char)(br.read());
System.out.println("The names starting with the letter '"+ch+"' are  -->");
for(i=0;i<5;i++)
{
if((s[i].charAt(0))==ch)
System.out.println(s[i]);
}
}
}