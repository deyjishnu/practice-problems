import java.io.*;
class series
{
public static void main(String args[])throws IOException
{
int i=0,n;
double s=0.0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
n=Integer.parseInt(br.readLine());
System.out.println("Enter the final value:");
for(i=2;i<=n;i+=2)
s=s+i;
System.out.println("Sum of the Series=");
}
}
