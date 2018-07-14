import java.util.Scanner;
public interface SearchMethods
{
  	int search(int a[],int n);
}

class linear implements SearchMethods
{ 
	Scanner sc=new Scanner(System.in);
	public int search(int a[],int n)
	{
		System.out.println("enter the no to be searched:");
		int num=sc.nextInt();
    		int c=0;
		for(int i=0;i<n;i++)
		{
   			if(a[i]==num)
			{
    				c=1;
				break;
			}
		}

		return c;

	}

}
class binary implements SearchMethods
{
 	Scanner sc1=new Scanner(System.in);

	public int search(int a[],int n)
	{
 		System.out.println("enter the no. to be searched:");
		int num=sc1.nextInt();
    		int c=0;
		int mid,beg=0,end=n-1;
		while(beg<end)
		{
  			mid=beg+end/2;
  			if(num==a[mid])
			{
				c=1;
				break;
			}
			else if(num>mid)
				beg=mid+1;
			else
				end=mid-1;
		}
		return c;
	}

}

class demo
{
 	public static void main(String[] args)
	{  
   		int m=1,z;
  		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of datas :");

		int n=sc.nextInt();
  		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
  			System.out.print("enter the value :");
			a[i]=sc.nextInt();
		}
		while(m==1)
		{
  			System.out.println("enter choice-> 1. linear search 2. Binary search");
   			z=sc.nextInt();
			switch(z)
			{
   				case 1: linear ob=new linear();
				//ob.search(a,n);
				int f;
				f=ob.search(a,n);
				if(f==1)
					System.out.println("no. present ");
				else
					System.out.println("no.not present");
				break;
				case 2: 
					int c1;
					binary ob1=new binary();
					c1=ob1.search(a,n);
					if(c1==1)
					System.out.println("no. present ");
					else
						System.out.println("no.not present");
						break;
					default:System.out.println("wrong choice ");
			}
			System.out.println("enter 1 to enter more else enter any other number ");
			int x=sc.nextInt ();
			if(x==1)
				m=1;
			else
				m=0;
		}
	}
}
   
