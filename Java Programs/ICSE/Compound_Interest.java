//prog. to calculate compound interest & amount when principle,rate% & time is given
import java.io.*;
class Compound_Interest
{
public static void main(String args[])throws IOException
{
int t,n;
double p,r,a,ci;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the principle : Rs.");
p=Double.parseDouble(br.readLine());
System.out.println();
System.out.print("Enter the rate percent : ");
r=Double.parseDouble(br.readLine());
System.out.println();
System.out.print("Enter the no. of years : ");
t=Integer.parseInt(br.readLine());
System.out.println();
System.out.print("Enter the no. of conversion-periods per year : ");
n=Integer.parseInt(br.readLine());
System.out.println();
a=p*(Math.pow(1+r/100,t*n));
ci=a-p;
System.out.println("Amount=Rs."+a);
System.out.println("Compound Interest=Rs."+ci);
}
}