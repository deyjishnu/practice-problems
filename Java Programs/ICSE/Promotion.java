import java.io.*;
class Promotion
{
public static void main(String args[])throws IOException
{
int a,b,c,d,e,sum=0;
double avg;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the marks of the 5 subjects");
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=Integer.parseInt(br.readLine());
d=Integer.parseInt(br.readLine());
e=Integer.parseInt(br.readLine());
sum=a+b+c+d+e;
avg=sum/5;
System.out.println("Grand Total="+sum);
System.out.println("Average="+avg);
if(avg>=40)
System.out.println("Promotion granted");
else
System.out.println("Promotion not granted");
}
}