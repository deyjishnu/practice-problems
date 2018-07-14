import java.io.*;
import java.lang.*;
class binaryToDecimal
{
     public static void main(String args[])throws IOException
     {
          double n,b,d;b=d=0.0;
          int n1,n2,l,i,j,a,c;
          String s,s1,s2;
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the binary number -->");
          n=Double.parseDouble(br.readLine());
          s=Double.toString(n);
          l=s.length();
          for(i=0;i<l;i++)
          {
              if(s.charAt(i)=='.')
              break;
          }
          s1=s.substring(0,i);
          s2=s.substring(i+1,l);
          n1=Integer.parseInt(s1);
          n2=Integer.parseInt(s2);
          System.out.println(n+","+s+","+s1+","+s2+","+n1+","+n2+","+l);
          for(j=i-1;j>=0;j--)      //TO CONVERT THE INTEGER PART
          {
              a=n1%10;
              b=b+a*Math.pow(2,j);
          }
          for(j=-(l-i);j<=-1;j++)     //TO CONVERT THE DECIMAL PART
          {
              c=n2%10;
              d=d+c*Math.pow(2,j);
          }
          System.out.println("The Decimal Equivalent = "+b+"."+d);
      }
}