import java.io.*;
class LCM
{
    public static void main(String args[])throws IOException
    {
      int n,i,j,c,max,lcm=0;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the number of integers -->");
      n=Integer.parseInt(br.readLine());
      int a[]=new int[n];
      System.out.println("Enter the "+n+" integers one by one -->");
      for(i=0;i<n;i++)
      a[i]=Integer.parseInt(br.readLine());
      max=a[0];
      for(i=1;i<n;i++)
      {
          if(a[i]>max)
          max=a[i];
      }
      for(j=1;;j++)
      {
          c=0;
          lcm=max*j;
          for(i=0;i<n;i++)
          {
              if(lcm%a[i]==0)
              c++;
          }
          if(c==n)
          {
           System.out.println("L.C.M = "+lcm);
           break;
          }
      }
    }
}       