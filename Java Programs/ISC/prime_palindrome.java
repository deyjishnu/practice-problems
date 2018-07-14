import java.io.*;
class prime_palindrome
{
int u,l;
public void getdata()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the lower limit :-");
l=Integer.parseInt(br.readLine());
System.out.println("Enter the upper limit :-");
u=Integer.parseInt(br.readLine());
}
public void check()
{
int i,j,r=0,s,c,f=0;
for(i=l;i<=u;i++)
{
  c=i;
  s=0;
   do
   {
       r=c%10;
       s=s*10+r;
       c=c/10;
    }
    while(c!=0);
    if(s==i)
   {
        for(j=2;j<s;i++)
   {
       if(s%j==0)
       {
           f++;
           break;
       }
    }
    System.out.println("Prime palindrome number is = "+s);
 }
}
}
}