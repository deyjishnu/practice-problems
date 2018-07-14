import java.io.*;
class a implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i+" ");
	                        Thread.sleep(100);
			}
		}
		catch(InterruptedException e)
		{
		}
	}
}
class b implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i+" ");
	                        Thread.sleep(80);
			}
		}
		catch(InterruptedException e)
		{
		}
	}
}

class demo
{
	public static void main(String args[])
	{
		a obj1=new a();
		b obj2=new b();
		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
	}
}