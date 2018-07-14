//sample input --> 18:03 ; sample output--> 3 minutes past 6
import java.io.*;
class Time
{
public static void main()throws IOException
{
String s;
int h,m;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the time -->");
s=br.readLine();
h=Integer.parseInt(s.substring(0,2));
m=Integer.parseInt(s.substring(3,5));
if(h>12)
h=h-12;
if(h==0)
h=12;
if(m==0)
System.out.println(h+" o'clock");
else
if(m==15)
System.out.println("Quarter past "+h);
else
if((m>0 && m<15)||(m>15 && m<30))
System.out.println(m+" minutes past "+h);
else
if(m==30)
System.out.println("Half past "+h);
else
if(m==45)
System.out.println("Quarter to "+h);
else
System.out.println((60-m)+" minutes to "+(h+1));
}
}