import java.io.*;
class Tribonacci
{
public static void main(String args[])throws IOException
{
int n,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of Tribonacci numbers -->");
n=Integer.parseInt(br.readLine());
int trib[]=new int[n];
trib[0]=0;
trib[1]=0;
trib[2]=1;
System.out.println("Enter the "+n+" tribonacci numbers one by one -->");
for(i=3;i<n;i++)
trib[i]=trib[i-1]+trib[i-2]+trib[i-3];
System.out.println("Tribonacci Numbers -->");
for(i=0;i<n;i++)
System.out.print(trib[i]+"  ");
}
}