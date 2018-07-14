//prog. to find the position of the first vowel and  adds Y if vowels are present on both the sides
import java.io.*;  //java class library
class uppercase
{
String s;  //Global variable
public void accept()throws IOException  //value accept
    {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Activating Buffer
    System.out.println("Enter the String :-");
    s=br.readLine();
    }
public void message()  //checks whether the string contains any lowercase letters
    {
    int i;
    char ch;
    for(i=0;i<s.length();i++)  //REPEAT UNTILL CONDITION IS SATISFIED
     {
     ch=s.charAt(i);
     if(Character.isLowerCase(ch))
      {
      System.out.println("Error !! This word contains lowercase letter  ");
     break;
      }
     }
    }
public void vowelposition()  //to print the position of the first vowel
    {
    int i;
    char ch;
    System.out.println(s);
    for(i=0;i<s.length();i++)  //REPEAT UNTILL CONDITION IS SATISFIED
     {
     ch=s.charAt(i);
     if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
      System.out.println("The position of the first vowel is "+(i+1));
      break;
      }
     }
    }
public void addY()  //Adds Y if vowels are present on both the sides of the string
    {
    char ch,ch1;
    ch=s.charAt(0);
    ch1=s.charAt(s.length()-1);
    if((ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')&&(ch1=='A'||ch1=='E'||ch1=='I'||ch1=='O'||ch1=='U'))
     System.out.println("The final string with adding Y is "+s+"Y");
    }
}