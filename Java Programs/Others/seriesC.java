import P1.*;
import java.util.*;
class seriesA implements serie
{
	public void print_series(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.print((int)Math.pow(10,i)+" ");
		}
	}
	public int count(int n)
	{
		return n;
	}
}
class Demo
{
	public static void main(String args[])
	{
		int n;
		seriesA ob=new seriesA();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
			n=sc.nextInt();
		ob.print_series(n);
		System.out.println("count ="+ob.count(n));
	}
}