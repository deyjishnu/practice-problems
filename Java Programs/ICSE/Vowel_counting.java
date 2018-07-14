import java.io.*;
class Vowel_counting
{
public static void main(String args[])throws IOException
{
String s;
int i,len=0,ai=0,ei=0,ii=0,oi=0,ui=0;
char ch=' ';
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the String");
s=br.readLine();
len=s.length();
for(i=0;i<len;i++)
{
ch=s.charAt(i);
/*switch(ch)
{
case 'a':
case 'A':
ai++;
break;*/
if((ch=='a')||(ch=='A'))
ai++;
else if((ch=='e')||(ch=='E'))
ei++;
else if((ch=='i')||(ch=='I'))
ii++;
else if((ch=='o')||(ch=='O'))
oi++;
else if((ch=='u')||(ch=='U'))
ui++;
else
continue;
}
System.out.println("Frequency of a="+ai);
System.out.println("Frequency of e="+ei);
System.out.println("Frequency of i="+ii);
System.out.println("Frequency of o="+oi);
System.out.println("Frequency of u="+ui);
}
}