import java.io.*;
class node
{
	int data;
	node next;
	node()
	{
		data=0;
		next=null;
	}
	node(int a,node h)
	{
		data=a;
		next=null;
		node temp=h;
		while(temp.next!=null)
			temp=temp.next;
		temp.next=this;
	}
	void display()
	{
		node temp=this.next;
		if(temp==null)
		{
			System.out.println("No node present");
			return;
		}
		System.out.println("Linked List --> ");
		while(temp!=null)
		{
			System.out.println(temp.data+" ");
			temp=temp.next;
		}
	}	
}
class LinkedList
{
	public static void main(String a[])throws IOException
	{
		int ch,s=0,p=0;
		node h=new node();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                while(s!=1)
		{
			System.out.println("Enter the choice:1-->Insert  2-->Display  3-->Exit");
			ch=Integer.parseInt(br.readLine());

		        if(ch==1)
			{
			
				System.out.println("Enter the data:");
			 	p=Integer.parseInt(br.readLine());
				node ob=new node(p,h);
		        	System.out.println("Data inserted");
				
			}
			if(ch==2)
				h.display();	
			if(ch==3)
				s=1;
		}
		
	}
}	