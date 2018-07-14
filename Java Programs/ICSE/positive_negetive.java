//wap to input nos & create 2 arrays each of which stores positive & negetive nos.;
import java.io.*;
class positive_negetive
{
public static void main(String args[])throws IOException
{
int i,pi=0,ni=0;
int a[]=new int[10];
int p[]=new int[10];
int n[]=new int[10];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the 10 numbers  ");
for(i=0;i<10;i++)
a[i]=Integer.parseInt(br.readLine());
//sorting begins
for(i=0;i<10;i++)
{
if(a[i]>0)
{
p[pi]=a[i];
pi++;
}
else
{
n[ni]=a[i];
ni++;
}
}
//print particular array ie positive array followed by negetive array
System.out.println(" POSITIVE NUMBERS ARE  ");
for(i=0;i<pi;i++)
System.out.print("   "+p[i]);
System.out.println();
System.out.println(" NEGETIVE NUMBERS ARE  ");
for(i=0;i<ni;i++)
System.out.print("   "+n[i]);
}
}