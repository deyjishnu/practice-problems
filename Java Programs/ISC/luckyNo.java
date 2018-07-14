//prog. to check whether a given number is a lucky number or not.
import java.io.*;  //java class library
class luckyNo
{
int n,s,x;  //Global variables
public void accept()throws IOException //Value accept
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Activating Buffer
    System.out.println("Enter the number :-");
    n=Integer.parseInt(br.readLine());
    x=s=n;  //Storing the accepted number in s & x
}
public void cal()  //For calculations
{
    int a,b,c;
    while(s>9)
    {
     n=s;s=0;
     while(n>0)
      {
      a=n/10;
      b=a*10;
      c=n-b;
      s=s+c;
      n=a;
      }
    }
}
public void display()  //For displaying the output
{
    if(s==1)
    System.out.println(x+" is a Lucky Number.");
    else
    System.out.println(x+" is not a Lucky Number.");
}
}