//program to search an element in a linked list and also print its occurrence
import java.io.*;
class node
{
int data;
node link;
public node()
{
data=0;
link=null;
}
public void accept()throws IOException
{
node start=new node();
node ptr=new node();
int n,i,x,c,f,y;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no. of nodes -->");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the first number -->");
start.data=Integer.parseInt(br.readLine());
ptr=start;
for(i=1;i<n;i++)
{
node tmp=new node();
System.out.println("Enter the next number -->");
tmp.data=Integer.parseInt(br.readLine());
ptr.link=tmp;
tmp.link=null;
//ptr=ptr.link;
ptr=tmp;
}
ptr=start;
System.out.println("Linked List -->");
while(ptr!=null)
{
System.out.print(ptr.data+"  ");
ptr=ptr.link;
}
System.out.println();
System.out.println("Enter the element to be searched -->");
x=Integer.parseInt(br.readLine());
ptr=start;
c=0;f=0;y=0;
while(ptr!=null)
{
if(ptr.data==x)
{
c++;
System.out.println("The number '"+x+"' is in the "+(f+1)+"th node.");
}
ptr=ptr.link;
f++;
}
if(c==0)
System.out.println("Sorry !! "+x+" is not found in the linked list.");
else
{
System.out.println("Number of occurrence of "+x+" is "+c);
}
}
}