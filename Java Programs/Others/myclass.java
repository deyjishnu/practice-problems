import P1.*;
class Myclass1 implements C,A
{
	int a=100;
	public void increment(int z)
	{
		a=a+z;
	}
	public void display()
	{
		System.out.println(a);
		System.out.println(x);
	}
	public void decrement(int x)
	{
		a=a-x;
	}
	public void show(String s)
	{
		System.out.println(s);
	}
}
class Myclass2
{
	int b=900;
}
class Myclass3 extends Myclass2 implements C.B
{
	public void increment(int z)
	{
		b=b+z;
	}
	public void display()
	{
		System.out.println(b);
	}
}
class demo
{
	public static void main(String args[])
	{
		Myclass1 mp1=new Myclass1();
		mp1.increment(10);
		mp1.display();
		mp1.decrement(5);
		mp1.display();
		mp1.show("hi!!!!!!");
		Myclass3 mp3=new Myclass3();
		mp3.increment(50);
		mp3.display();
	}
}	