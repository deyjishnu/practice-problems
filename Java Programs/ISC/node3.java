//PROGRAM TO CREATE A LINKED LIST OF 'n' NODES AND DISPLAY THE LINKED LIST
import java.io.*;
class node3
{
int data;
node3 link;
public node3()
{
data=0;
link=null;
}
public void accept()throws IOException
{
node3 start=new node3();
node3 ptr;

int n,i,x,c,f,y;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the no. of nodes -->");
n=Integer.parseInt(br.readLine());
System.out.println("Enter the first number -->");
start.data=Integer.parseInt(br.readLine());
ptr=start;
for(i=1;i<n;i++)
{
node3 tmp=new node3();
System.out.println("Enter the next number -->");
tmp.data=Integer.parseInt(br.readLine());
ptr.link=tmp;
tmp.link=null;
ptr=tmp;
}
ptr=start;
System.out.println("Linked List -->");
while(ptr!=null)
{
System.out.print(ptr.data+"  ");
ptr=ptr.link;
}
}
}