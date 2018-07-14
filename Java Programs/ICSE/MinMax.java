//WAP to display the minimum,maximum no. & sum of values from a SDA
import java.io.*;
class MinMax
{
public static void main(String args[])throws IOException
{
int i,min,max,sum=0;
int m[]=new int[5];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 5 values -->");
for(i=0;i<5;i++)
{
m[i]=Integer.parseInt(br.readLine());
}
max=min=m[0];
for(i=0;i<5;i++)
{
if(max<m[i])
max=m[i];
if(min>m[i])
min=m[i];
sum=sum+m[i];
}
System.out.println(">Minimum value of the array is "+min);
System.out.println(">Maximum value of the array is "+max);
System.out.println(">Sum of the values of the array is "+sum);
}
}