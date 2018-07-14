import java.io.*;
class Union
{
   int n,m,i,y;    //Global variables
   public void accept()throws IOException
   {
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
      Union obj=new Union();    //creating an object of class Union
      y=obj.working(a,c);      //Calling method
      y=obj.working(b,c);      //Calling method
      System.out.println("The union of the two arrays is -->");    //Printing the output
      for(i=0;i<y;i++)
      System.out.println(c[i]+"  ");
   }
   public int working(int x[],int c[])   //For finding the union
   {
      int j,d,l;
      l=x.length;  //calculating the length of the passed array x[]
      for(i=0;i<l;i++)
      {
         d=0;
         for(j=0;j<y;j++)
         {
            if(x[i]==c[j])
            {
               d=1;
               break;
            }
         }
         if(d==0)
         {
            c[y]=x[i];  //Entering values into the array c[ ]
            y++;
         }
      }
      return(y);
   }
}