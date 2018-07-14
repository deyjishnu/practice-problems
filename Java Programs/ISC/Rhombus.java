//prog to accept a string which is a word and form a hollow daimond with its letters
//     B
//   O   O
//  O     O
// K       K
//  O     O
//   O   O
//     B
import java.io.*;  //Java Class Library
class Rhombus
{
String s;
public void accept()throws IOException  //Value Accept
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string -->");
s=br.readLine();
}
public void display()   //Displays the output
{
    int l,i,j,m=0,k=1;
    l=s.length();
    System.out.println("Rhombus Pattern -->");
    for(i=0;i<l;i++)    // FOR UPPER PART OF THE RHOMBUS
    {
         m=0;
         for(j=0;j<l-i-1;j++)   //creating spaces
         System.out.print(" ");
         System.out.print(s.charAt(i));
         if(i==0)
         {
          System.out.println();
          continue;
         }
         for(j=0;j<i*2-1;j++)//creating spaces
         {
           System.out.print(" ");
           m++;
         }
         System.out.print(s.charAt(i));
         System.out.println();
    }
    for(i=0;i<l-1;i++) //FOR LOWER PART OF THE RHOMBUS
    {
      for(j=0;j<=i;j++)
      System.out.print(" ");
      System.out.print(s.charAt(l-k-1));
      if(l-k-1==0)
      continue;
      for(j=0;j<m-(i+1)*2;j++)
      System.out.print(" ");
      System.out.print(s.charAt(l-k-1));  
      k++;
      System.out.println();
    }
   }
  }