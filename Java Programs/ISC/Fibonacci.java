import java.io.*;
class Fibonacci
{
public static void main(String args[])throws IOException
{
int n,i;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of Fibonacci numbers -->");
n=Integer.parseInt(br.readLine());
int fib[]=new int[n];
fib[0]=0;
fib[1]=1;
System.out.println("Enter the "+n+" fibonacci numbers one by one -->");
for(i=2;i<n;i++)
fib[i]=fib[i-1]+fib[i-2];
System.out.println("Fibonacci Numbers -->");
for(i=0;i<n;i++)
System.out.print(fib[i]+"  ");
}
}