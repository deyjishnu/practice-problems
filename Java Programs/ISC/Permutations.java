import java.io.*;
class Permutations
{
public static void main(String args[])throws IOException
{
int n,m,i,j,x,y,r,a,nod;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number -->");
n=Integer.parseInt(br.readLine());
m=n;nod=x=0;
while(m!=0)
{
m=m/10;
nod++;
}
for(i=0;i<10;i++)
{
a=n;
while(a!=0)
{
r=a%10;
if(r==i)
x=x*10+r;
a=a/10;
}
}
System.out.println("Permutations -->");
for(i=x;i<Math.pow(10,nod);i++)
{
y=0;
for(j=0;j<10;j++)
{
a=i;
while(a!=0)
{
r=a%10;
if(r==j)
y=y*10+r;
a=a/10;
}
}
if((y==x) && ((i-Math.pow(10,nod-1))>=0))
System.out.println(i);
}
}
}