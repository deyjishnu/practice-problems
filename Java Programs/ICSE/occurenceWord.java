import java.io.*;
class occurenceWord
{
public static void main(String args[])throws IOException
{
int i,l=0,count=0;
String s1,s2="",s3="";
char ch=' ';
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String  ");
s1=br.readLine();
System.out.println("Enter the word to be searched  ");
s2=br.readLine();
l=s1.length();
for(i=0;i<l;i++)
{
ch=s1.charAt(i);
if(ch==' ')
{
if(s2.equals(s3))
count++;
s3="";
}
else
{
s3=s3+ch;
if(s2.equals(s3))
count++;
}
  }
System.out.println("no of occurence of the word :"+count);
}
}