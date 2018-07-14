import java.io.*;
class HCF
{
    public static void main(String args[])throws IOException
    {
      int n,i,j,c,min,hcf=0;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the number of integers -->");
      n=Integer.parseInt(br.readLine());
      int a[]=new int[n];
      System.out.println("Enter the "+n+" integers one by one -->");
      for(i=0;i<n;i++)
      a[i]=Integer.parseInt(br.readLine());
      min=a[0];
      for(i=1;i<n;i++)
      {
          if(a[i]<min)
          min=a[i];
      }
      for(j=1;j<=min;j++)
      {
          c=0;
          for(i=0;i<n;i++)
          {
              if(a[i]%j==0)
              c++;
          }
          if(c==n)
          hcf=j;
      }
      System.out.println("H.C.F ="+hcf);
    }
}