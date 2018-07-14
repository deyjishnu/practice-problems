import java.io.*;
class node
{
	int data;
	node next;
	node(int a)
	{
		data=a;
		next=null;
	}
	void setdata(int a)
	{
		node obj=new node(a);
		node h=this;
		while(h.next!=null)
		{
			h=h.next;
		}
		h.next=obj;
	}
	void display()
	{
		node l=this;
		while(l.next!=null)
		{
			System.out.println("\n"+l.data);
			l=l.next;
		}
		System.out.println("\n"+l.data);
	}	
}
class List
{
	public static void main(String a[])throws IOException
	{
		int ch,s=0,p=0;
		node obj1=new node(p);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                while(s!=1)
		{

		System.out.println("Enter the choice:\n1-->Insert\n2-->Display\n3-->Exit");
		ch=Integer.parseInt(br.readLine());
		
			if(ch==1)
			{
			
				System.out.println("Enter the data:");
			 	p=Integer.parseInt(br.readLine());
				obj1.setdata(p);
		        	System.out.println("Data inserted");
				
			}
			if(ch==2)
			{
				obj1.display();
			}	
			if(ch==3)
				s=1;
		}
		
	}
}	
		