import java.io.*;
class Repeated
{
   public void accept()throws IOException
   {
      int n,i,j,d,y=0;  //Global Variables
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the number of integers in the array -->");
      n=Integer.parseInt(br.readLine());
      int a[]=new int[n];
      int b[]=new int[n];
      System.out.println("Enter the integers of the array one by one -->");
      for(i=0;i<n;i++)
      a[i]=Integer.parseInt(br.readLine());   //Entering the elements 
      for(i=0;i<n;i++)    //Removing repeated elements
      {
         d=0;
         for(j=0;j<y;j++)
         {
            if(a[i]==b[j])
            {
               d=1;
               break;
            }
         }
         if(d==0)
         {
            b[y]=a[i];   //Entering the values into the array b[ ]
            y++;         //Counting the no. of elements entered
         }
      }
      System.out.println("The array without the repeated elements -->");  //Printing
      for(i=0;i<y;i++)
      System.out.print(b[i]+"  ");
   }
}