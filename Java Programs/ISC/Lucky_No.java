import java.io.*;
class Lucky_No
{
    public static void main(String args[])throws IOException
    {
      int n,i,j,k,c;
      k=1;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the number of elements -->");
      n=Integer.parseInt(br.readLine());
      c=n;
      int a[]=new int[n];
      for(i=0;i<n;i++)
      a[i]=i+1;
      while(k<c)
      {
      for(i=k;i<n;i=i+(k+1))
      {
          if(a[i]==0)
          break;
          a[i]=0;
      }
      for(i=0;i<n;i++)
      {
          if(a[i]==0)
          {
              for(j=i;j<n-1;j++)
              a[j]=a[j+1];
          }
      }
      k++;
      for(i=0;i<n;i++)
      {
          if(a[i]==0)
          {
              c=i;
              break;
          }
      }
     }
     for(i=0;i<n;i++)
     {
         if(a[i]==0||a[i]==n)
         break;
     System.out.print(a[i]+"  ");
     }
}
}