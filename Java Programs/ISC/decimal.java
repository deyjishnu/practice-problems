import java.io.*;
class decimal
{
     public static void main(String args[])throws IOException
     {
          int n,i,a;i=0;
          double b;b=0.0;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the binary number -->");
          n=Integer.parseInt(br.readLine());
          do
          {
              a=n%10;
              b=b+a*Math.pow(2,i);
              i++;
              n=n/10;
          }
          while(n!=0);
          System.out.println("The Decimal Equivalent = "+b);
     }
}