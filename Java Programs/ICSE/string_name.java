// To arrange names in ascending order using Bubble sort
import java.io.*;
class string_name
{
    public static void main(String args[])throws IOException
    {
    int i,j;
    String tmp="";
    String a[]=new String[5];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the names :-");
    for(i=0;i<5;i++)
    a[i]=br.readLine();
    // Sorting begins
    for(i=0;i<5;i++)
    {
      for(j=0;j<4-i;j++)
      {
        if(a[j].compareTo(a[j+1])>0)
        {
        tmp=a[j];
        a[j]=a[j+1];
        a[j+1]=tmp;
        }
        tmp="";
      }
    }
    // Printing begins
    System.out.println("The required ascending order  -->");
    for(i=0;i<5;i++)
    System.out.println(a[i]);
    }
}