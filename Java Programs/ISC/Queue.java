//program to show insertion and deletion in a queue
import java.io.*;
class Queue
{
int n;int f=-1;int r=-1;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
public void create()throws IOException
{
int k;
System.out.println("Enter the size of the queue -->");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
System.out.println(".....MENU.....");
System.out.println("1....INSERT.....");
System.out.println("2....DELETE......");
System.out.println("3...DISPLAY...");
System.out.println("4....EXIT.....");
do
{
System.out.println("Enter your choice -->");
k=Integer.parseInt(br.readLine());
if(k==1)
insert(a,n);
else if(k==2)
delete(a);
else if(k==3)
display(a);
else if(k==4)
System.exit(0);
else
System.out.println("Wrong choice !! Try again");
}
while(k!=4);
}
public void insert(int a[],int n)throws IOException
{
int x;
if(r==n-1)
System.out.println("Queue Overflows !!");
else
{
if(f==-1&&r==-1)
{
f=0;
r=0;
}
else
r=r+1;
System.out.println("Enter the item -->");
x=Integer.parseInt(br.readLine());
a[r]=x;
}
return;
}
public void delete(int a[])
{
if(f==-1&&r==-1)
System.out.println("Queue underflows !!");
else
{
System.out.println("Value to be deleted -->"+a[f]);
a[f]=0;
if(f==r)
{
f=-1;
r=-1;
}
else
f=f+1;
}
return;
}
public void display(int a[])
{
int i;
System.out.println("Values in Queue -->");
for(i=0;i<n;i++)
System.out.print(a[i]+"  ");
System.out.println();
return;
}
}