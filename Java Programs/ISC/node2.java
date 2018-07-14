//program to create a linked list and insert or delete nodes and display the linked list
import java.io.*;
class node2
{
int data;
node2 link;
public node2()
{
data=0;
link=null;
}
public void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,ch,p,c;
node2 start=new node2();
node2 ptr=new node2();
node2 ptr1=new node2();
System.out.println("Enter the no. of nodes -->");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the numbers -->");
start.data=Integer.parseInt(br.readLine());
ptr=start;
for(i=1;i<n;i++)   //to create the linked list
{
node2 tmp=new node2();
tmp.data=Integer.parseInt(br.readLine());
ptr.link=tmp;
tmp=null;
ptr=ptr.link;
}
System.out.println(".....MENU.....");
System.out.println("1....INSERT A NODE.....");
System.out.println("2....DELETE A NODE......");
System.out.println("3...DISPLAY THE LINKED LIST...");
System.out.println("4....EXIT.....");
do
{
System.out.println("Enter your choice -->");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:  //insert a node
node2 tmp=new node2();
System.out.println("Enter the index position of the node after which a new node is to be inserted -->");
p=Integer.parseInt(br.readLine());
System.out.println("Enter data for the new node -->");
tmp.data=Integer.parseInt(br.readLine());
tmp.link=null;
ptr=start;
c=0;
while(c<p)
{
ptr=ptr.link;
c++;
}
tmp.link=ptr.link;
ptr.link=tmp;
break;
case 2:   //delete a node
System.out.println("Enter the index position of the node which is to be deleted -->");
p=Integer.parseInt(br.readLine());
ptr=start;
ptr1=ptr;
c=0;
while(c<p)
{
ptr1=ptr;
ptr=ptr.link;
c++;
}
ptr1.link=ptr.link;
ptr.link=null;
ptr=ptr1=null;
break;
case 3:  //display the linked list
ptr=start;
System.out.println("Linked List -->");
while(ptr!=null)
{
System.out.print(ptr.data+"  ");
ptr=ptr.link;
}
System.out.println();
break;
case 4:  //to exit
System.exit(0);
break;
default:   //default case
System.out.println("Wrong choice !! Try again");
}
}
while(ch!=4);   //to exit from the loop
}
}