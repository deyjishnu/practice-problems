import java.io.*;
class Weekdays
{
public static void main(String args[])throws IOException
{
int ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a value from 1 to 7,Exit by typing 8");
do
{
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("Sunday");
break;
case 2:
System.out.println("Monday");
break;
case 3:
System.out.println("Tuesday");
break;
case 4:
System.out.println("Wednesday");
break;
case 5:
System.out.println("Thursday");
break;
case 6:
System.out.println("Friday");
break;
case 7:
System.out.println("Saturday");
break;
case 8:
System.out.println("The loop has exitted");
System.exit(0);
break;
default:
System.out.println("Wrong Entry");
}
}
while(true);
}
}