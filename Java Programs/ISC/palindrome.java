import java.io.*;
class palindrome
{
int ll,ul,x,a,i;
public palindrome()//constructor
{
a=0;
ll=0;
ul=0;
i=0;
}
public void getData()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the lower limit -->");
ll=Integer.parseInt(br.readLine());
System.out.println("Enter the upper limit -->");
ul=Integer.parseInt(br.readLine());
}
public int palin(int x)
{
int a=0,m;
m=x;
do
{
a=a*10+x%10;
x=x/10;
}
while(x>0);
if(a==m)
return(a);
else
return(0);
}
public void display()
{
System.out.println(a+" ");
}
public void start()throws IOException
{
int s,i;
palindrome in=new palindrome();
in.getData();
System.out.println("LLL "+ll);
for(i=ll;i<=ul;i++)
{
s=in.palin(i);
if(s!=0)
in.display();
}
}
}