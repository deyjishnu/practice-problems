//program to count the no. of occurence of a particular no. in an array containing 20 elements;
import java.io.*;
class No_of_Occurence
{
public static void main(String args[])throws IOException
{
int i,p,oc=0;
int a[]=new int[10];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the 10 numbers  ");
for(i=0;i<10;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("enter a particular number    ");
p=Integer.parseInt(br.readLine());
for(i=0;i<10;i++)
{
if(p==a[i])
{
System.out.println("a["+(i+1)+"]="+a[i]);
oc++;
}
}
System.out.println("number of occurance of the  number'"+p+"' is "+oc);
}
}