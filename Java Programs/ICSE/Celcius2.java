import java.io.*;
class Celcius2
{
public static void main(String args[])throws IOException
{
int i;
char ch[]=new char[1];
double c=0.0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
double a[]=new double[20];
for(i=0;i<20;i++)
{
//ch[0]=(char)br.read();
//if(ch[0]=='n')
//break;
System.out.println("Enter the temperature in degree farhenheit:");
a[i]=Double.parseDouble(br.readLine());
c=5.0*(a[i]-32.0)/9.0;
System.out.println("Converted temperature in degree celcius = "+c);
System.out.println("Do you want to continue? Enter 'n' for termination,and 'y' for continuation");
}
}
}