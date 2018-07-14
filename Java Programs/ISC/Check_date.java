//program to accept a date in dd mm yyyy format and check whether the date is valid or invalid
import java.io.*;
class Check_date
{
public static void main()throws IOException
{
int d,m,y,i;
i=0;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a date in dd mm yyyy format -->");
d=Integer.parseInt(br.readLine());
m=Integer.parseInt(br.readLine());
y=Integer.parseInt(br.readLine());
if(y>0)
{
if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
{
if(d>=1 && d<=31)
i=1;
}
else
if(m==4||m==6||m==9||m==11)
{
if(d>=1 && d<=30)
i=1;
}
else
{
if(m==2)
{
if(y%4==0)
{
if(d>=1 && d<=29)
i=1;
}
else
{
if(d>=1 && d<=28)
i=1;
}
}
}
}
if(i==1)
System.out.println("VALID DATE");
else
System.out.println("INVALID DATE");
}
}