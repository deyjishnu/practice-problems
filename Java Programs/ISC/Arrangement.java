import java.io.*;
class Arrangement
{
public static void main(String args[])throws IOException
{
String s,w="",tmp="";
char ch;
int l,i,j,k=0,p=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a sentence -->");
s=br.readLine();
s=s+" ";
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch==' ')
k++;
}
String a[]=new String[k];
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch!=' ')
w=w+ch;
else
{
a[p]=w;
w="";
p++;
}
}
for(i=0;i<p;i++)
{
for(j=0;j<p-1;j++)
{
if(a[j].length()>a[j+1].length())
{
tmp=a[j];
a[j]=a[j+1];
a[j+1]=tmp;
}
if(a[j]==a[j+1])
{
if(a[j].compareTo(a[j+1])>0)
{
tmp=a[j];
a[j]=a[j+1];
a[j+1]=tmp;
}
}
}
}
System.out.println("The words according to their length -->");
for(i=0;i<p;i++)
{
System.out.print(a[i]+" ");
System.out.println();
}
}
}