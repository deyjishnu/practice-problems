//program to accept a character and check whether it is a letter or not.If it is a letter change its case,otherwise check whether it is a digit or a special character.
import java.io.*;
class Prog1
{
public static void main(String args[])throws IOException
{
char ch;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a character -->");
ch=(char)(br.read());
if(Character.isLetter(ch))
{
System.out.println(ch+" is a letter");
if(Character.isUpperCase(ch))
System.out.println(ch+" in Lowercase is "+(Character.toLowerCase(ch)));
else
System.out.println(ch+" in Uppercase is "+(Character.toUpperCase(ch)));
}
else
{
System.out.println(ch+" is not a letter");
if(Character.isDigit(ch))
System.out.println(ch+" is a digit");
else
System.out.println(ch+" is a special character");
}
}
}