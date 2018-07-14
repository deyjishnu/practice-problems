import java.io.*;
class Input
{
    int code,rate,quantity,s=0;
    void input()throws IOException
    {
        int i=1;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	while(i==1)
	{
	    System.out.println("Enter the item code -->");
	    code=Integer.parseInt(br.readLine());
	    System.out.println("Enter the item rate -->");
	    rate=Integer.parseInt(br.readLine());
	    System.out.println("Enter the item quantity -->");
	    quantity=Integer.parseInt(br.readLine());
	    s=s+(rate*quantity);
	    System.out.println ("Press 1 to continue else any other integer -->");
	    i=Integer.parseInt(br.readLine());
	}
    }
    void cal(String ch)
    {
        System.out.print("Bill with cash payment = Rs."+s);
    }
    void cal(String ch,double a)
    {
	double p=0.00;
	p=((s*a)/100)+s;
	System.out.println("Bill with debit = Rs."+p);
    }
    void cal(String ch,int a)
    {
	double p=0.00;
	p=((s*a)/100)+s;
	System.out.println("Bill with credit = Rs."+p);
    }
}
class Demo
{
    public static void main(String args[])throws IOException
    {
        String p;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Enter the mode of Payment -->");
	p=br.readLine();
	if(p.equals("Cash")==true)
	{
            Input obj=new Input();
	    obj.input();
	    obj.cal("Cash");
        }
	else if(p.equals("Debit")==true)
	{
            Input obj1=new Input();
	    obj1.input();
	    obj1.cal("Debit",0.5);
        }
	else if(p.equals("Credit")==true)
	{
            Input obj2=new Input();
	    obj2.input();
	    obj2.cal("Credit",1);
	}
        else
        System.out.println("Wrong Entry !! Try Again");
    }
}