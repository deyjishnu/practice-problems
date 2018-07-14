import java.io.*;
class A extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i+" ");
	                        sleep(100);
			}
		}
		catch(InterruptedException e)
		{
		}
	}
}
class B extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+" ");
	                        sleep(80);
			}
		}
		catch(InterruptedException e)
		{
		}
	}
}
class Demo
{
	public static void main(String args[])
	{
		A ob1=new A();
		B ob2=new B();
		ob1.start();
		ob2.start();
	}
}


   //Thread t=new Thread(ob1);
  //   t.start();