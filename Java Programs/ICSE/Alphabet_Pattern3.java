import java.io.*;
class Alphabet_Pattern3
{
public static void main(String args[])throws IOException
{
String s;
int len=0,i,j;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String");
s=br.readLine();
len=s.length();
System.out.println("Specified pattern is below");
for(i=0;i<len;i++)
{
for(j=0;j<len-i;j++)
{
System.out.print(s.charAt(j));
}
System.out.println();
}
}
}