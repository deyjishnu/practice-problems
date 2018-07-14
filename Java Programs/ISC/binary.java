//prog. to find the binary equivalent of a number and form an inverted triangle
import java.io.*;  //java class library
class binary
{
int n,x;  //Global variables
String s="";
public void accept()throws IOException  //Value Accept
    {
    String s="";
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Activating Buffer
    System.out.println("Enter a number -->");
    n=Integer.parseInt(br.readLine());
    x=n;  //Storing the accepted number in x
    }
public void binaryEq()  //Calculates Binary Equivalent of the number
    {
    do  //To find the Binary Equivalent by Repeated Division Method
      {
      s=n%2+s;
      n=n/2;
      }
    while(n>0);
  System.out.println("The Binary Equivalent of "+x+" is = "+s);//Prints the Binary Equivalent
    }
public void invTriangle()  //to form an inverted triangle using the binary equivalent
    {
    int l,i,j;
    l=s.length();  //calculates the length of string s
    System.out.println("Inverted Triangle -->");
    for(i=0;i<l;i++)
      {
      for(j=0;j<i;j++)
       System.out.print("  ");
      for(j=i;j<l-i;j++)
       System.out.print(s.charAt(j)+" ");
     System.out.println();
      }
    }
}