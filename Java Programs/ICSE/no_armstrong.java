import java.io.*;
class no_armstrong
{
public static void main(String args[])
{
int i,m,a,b,c,s=0;
System.out.println("no are");
for(i=1;i<9000;i++)
{
m=i;
       while(m>0)
       {
         a=m/10;
         b=a*10;
         c=m-b;
         s=s+c*c*c;
         m=m/10;
        }
          if(i==s)
        System.out.println(s);
        a=b=c=s=0;
    }
}
}
