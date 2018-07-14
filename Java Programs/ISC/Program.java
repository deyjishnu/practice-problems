import java.io.*;
class Program
{
    public static void main(String args[])throws IOException
    {
      int n,i,j,tmp,m,lm,mm,pos;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter the number of elements -->");
      n=Integer.parseInt(br.readLine());
      m=n/2;
      lm=m;
      mm=m+1;
      int a[]=new int[n];
      System.out.println("Enter the numbers into the array-->");
      for(i=0;i<n;i++)
      a[i]=Integer.parseInt(br.readLine());
      for(i=0;i<n;i++)
      {
          pos=0;
          for(j=1;j<n;j++)
          {
              if(j<=lm||j>=mm)
              {
                  if(a[j]>a[pos])
                  pos=j;
              }
          }
          if(i%2==0)
          {
              tmp=a[lm];
              a[lm]=a[pos];
              a[pos]=tmp;
              lm--;
          }
          else
          {
              tmp=a[mm];
              a[mm]=a[pos];
              a[pos]=tmp;
              mm++;
          }
      }
      System.out.println("The required order -->");     //Print the sorted array
      for(i=0;i<n;i++)
      System.out.print(a[i]+" ");
    }
}