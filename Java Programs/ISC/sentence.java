//prog. to calculate the frequency of a given word in a sentence
import java.io.*;  //java class library
class sentence
{
String s,w;int c;  //Global variables
public void accept()throws IOException  //Value accept
    {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //Activating Buffer
    System.out.println("Enter a sentence -->");
    s=br.readLine();
    System.out.println("Enter a word to be checked -->");
    w=br.readLine();
    }
public void cal()  //For calculations
    {
    int i,l;c=0;
    String s1;s1="";
    char ch;
    s=s+" ";  //Adding a space to the string
    l=s.length();
    for(i=0;i<l;i++)
     {
     ch=s.charAt(i);
     if(ch!=' ')
      s1=s1+ch;
     else
      {
       if(w.equalsIgnoreCase(s1))
        c++;  //calculates the frequency of the word
       s1="";
      }
     }
    }
public void display()  //Displays the Output
    {
    System.out.println("Frequency of the word '"+w+"' = "+c);
    }
}