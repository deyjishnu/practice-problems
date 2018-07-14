import java.io.*;
class Linear_Search
{
public static void main(String args[])throws IOException
{
int i,j,s,flag=0,pos=0;
int a[]=new int[5];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//value accept
System.out.println("Enter the values");
for(i=0;i<5;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
System.out.println("Enter the value to be searched");
s=Integer.parseInt(br.readLine());
for(i=0;i<5;i++)
{
if(a[i]==s)
{
flag=1;
pos=i;
break;
}
}
if(flag==1)
System.out.println("the value is found at "+(pos+1)+" position");
else
System.out.println("the value is not found");
}
}