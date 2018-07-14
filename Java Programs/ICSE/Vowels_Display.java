//prog to accept a word/a String & display all the vowels present in it
import java.io.*;
class Vowels_Display
{
public static void main(String args[])throws IOException//main method line
{
int i,len=0;;
char chr;
String s;//for holding the accepted String
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Desired String:-");
s=br.readLine();
len=s.length();//for calculating the no. of characters present in the accepted String
System.out.println("The vowels present in the String:-");
for(i=0;i<len;i++)//'For Loop' started
{
chr=s.charAt(i);//for returning the chracters of the string by their position
if(chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u'||chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U')//to check whether the character is a vowel or not
System.out.println(chr);//for printing the vowels present in the String
}
}
}