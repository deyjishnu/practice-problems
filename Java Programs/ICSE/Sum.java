import java.io.*;
class Sum
{
public static void main(String args[])throws IOException
{
int i,s=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a[]=new int [15];
System.out.println("Enter 15 nos. each of 3 digits:-");
for(i=0;i<15;i++)
{
a[i]=Integer.parseInt(br.readLine());
s+=a[i]/10;
}
System.out.println("Sum="+s);
}
}