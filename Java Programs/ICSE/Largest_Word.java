//prog. to accept the desired no. of words each of whose no. of characters will calculated and the largest among them will be displayed
import java.io.*;
class Largest_Word
{
public static void main(String args[])throws IOException
{
int n=0,i,j,len=0,max=0;
String fs="";
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Q1> Enter the 'number of words' you want to compare:-");
n=Integer.parseInt(br.readLine());
String s[]=new String[n];
System.out.println("Q2> Enter the "+n+" words:-");
for(i=0;i<n;i++)
{
System.out.print((i+1)+".");
s[i]=br.readLine();
len=s[i].length();
if(i==n-1)
{
System.out.println("Ans1> No. of characters in each word:-");
for(j=0;j<=i;j++)
System.out.println((j+1)+"."+s[j]+"="+(s[j].length()));
}
if(len>max)
{
max=len;
fs=s[i];
}
}
System.out.println("Ans2> Largest of the "+n+" words:- "+fs);
}
}