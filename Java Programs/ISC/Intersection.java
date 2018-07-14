import java.io.*;
class Intersection
{
   public void accept()throws IOException
   {
      int n,m,i,j,k,d,y=0;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the number of integers in the first array -->");
      n=Integer.parseInt(br.readLine());
      System.out.println("Enter the number of integers in the second array -->");
      m=Integer.parseInt(br.readLine());
      int a[]=new int[n];
      int b[]=new int[m];
      int c[]=new int[n+m];
      System.out.println("Enter the integers of the first array one by one -->");
      for(i=0;i<n;i++)      //Entering the elements
      a[i]=Integer.parseInt(br.readLine());
      System.out.println("Enter the integers of the second array one by one -->");
      for(i=0;i<m;i++)      //Entering the elements
      b[i]=Integer.parseInt(br.readLine());
      for(i=0;i<n;i++)   //For finding the intersection
      {
         for(j=0;j<m;j++)
         {
            d=0;
            if(a[i]==b[j])
            {
               for(k=0;k<y;k++)
               {
                  if(a[i]==c[k])
                  {
                     d=1;
                     break;
                  }
               }
               if(d==0)
               {
                  c[y]=a[i];  //Entering values into the array c[ ]
                  y++;
                  break;
               }
            }
         }
      }
      System.out.println("The intersection of the two arrays is -->");    //Printing the output
      for(i=0;i<y;i++)
      System.out.print(c[i]+"  ");
   }
}