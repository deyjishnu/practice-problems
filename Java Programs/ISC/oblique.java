//prog.to print the oblique pattern of a string
import java.io.*;  //java class library
class oblique
{
String s;  //Global variable
public void accept()throws IOException  //Value accept
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //Activating Buffer
System.out.println("Enter the String :-");
s=br.readLine();
}
public void display()  //To display the Output
{
int i,j;
for(i=0;i<s.length();i++)  //REPEAT UNTILL CONDITION IS SATISFIED
{
for(j=0;j<i;j++)  //USED FOR CREATING SPACE
System.out.print(" ");
System.out.println(s.charAt(i));
}
}
}