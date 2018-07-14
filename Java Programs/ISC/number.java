//prog. to find out the no. of digits,highest and lowest digit,sum of all digits -of a number.
import java.io.*;  //java class library
class number
{
int n,c,h,l,sum;  //Global variables
public void accept()throws IOException  //Value accept
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Activating Buffer
    System.out.println("Enter the number :-");
    n=Integer.parseInt(br.readLine());
    }
public void cal()  //For calculations
    {
    int r,d;r=0;
    do  //reverse the number
     {
     d=n%10;
     r=r*10+d;
     n=n/10;
     c++;  //calculates the no. of digits
     }
    while(n!=0);
    h=l=r%10;
    do  //finds highest and lowest digit
     {
     d=r%10;
     if(h<d)
     h=d;
     if(l>d)
     l=d;
     sum=sum+d;  //calculates the sum of digits
     r=r/10;
     }
    while(r!=0);
    }
public void display()  //Displays the Output
    {
     System.out.println("NO. OF DIGITS  = "+c);
     System.out.println("HIGHEST DIGIT  = "+h);
     System.out.println("LOWEST DIGIT  = "+l);
     System.out.println("SUM OF THE DIGITS  = "+sum);
    }
}