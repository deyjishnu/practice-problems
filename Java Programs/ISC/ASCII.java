import java.io.*;
class ASCII
{
public static void main(String args[])throws IOException
{
int n,ascii,ascii1,ascii2,i;
char ch,ch1,ch2;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("..........................MENU................................");
System.out.println("1. .........Print ASCII code of a character...................");
System.out.println("2. ...... Print ASCII codes of a number of characters.........");
System.out.println("3. ...Print the character represented by an ASCII code.........");
System.out.println("4. Print the characters represented by a range of ASCII codes ");
System.out.println("5. ......................Exit.................................");
do
{
System.out.println("Enter your choice -->");
n=Integer.parseInt(br.readLine());
switch(n)
{
case 1:
System.out.println("Enter the character -->");
ch=(char)br.read();
ascii=(int)ch;
System.out.println("ASCII code of '"+ch+"' is "+ascii);
System.out.println("n  =  "+n);
break;
case 2:
System.out.println("Enter the first character -->");
ch1=(char)br.read();
ascii1=(int)ch1;
System.out.println("Enter the last character -->");
ch2=(char)br.read();
ascii2=(int)ch2;
System.out.println("Characters...ASCII code");
for(i=ascii1;i<=ascii2;i++)
System.out.println("   "+(char)i+"          "+i);
break;
case 3:
System.out.println("Enter the ASCII code -->");
ascii=Integer.parseInt(br.readLine());
ch=(char)ascii;
System.out.println("Character '"+ch+"' is represented by the ASCII code "+ascii);
break;
case 4:
System.out.println("Enter the first ASCII code -->");
ascii1=Integer.parseInt(br.readLine());
System.out.println("Enter the last ASCII code -->");
ascii2=Integer.parseInt(br.readLine());
System.out.println("ASCII code...Characters");
for(i=ascii1;i<=ascii2;i++)
System.out.println("   "+i+"          "+(char)i);
break;
case 5:
System.exit(0);
break;
default:
System.out.println("Wrong Entry !! Try Again...");
}
}
while(n!=5);
}
}