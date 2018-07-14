import java.io.*;  //Java Class Library
class Spiral
{
public static void main(String args[])throws IOException  //Value Accept
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Activating buffer
int r,c,n,d,x,b,y,i,j,k,min,z,p;
y=0;
x=0;
System.out.println("Enter the no. of rows of matrix -->");
r=Integer.parseInt(br.readLine());
System.out.println("Enter the no. of columns of matrix -->");
c=Integer.parseInt(br.readLine());
int a[][]=new int[r][c];
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
a[i][j]=0;
}
i=0;
j=c-1;
k=r-1;
System.out.println("Enter a number -->");
n=Integer.parseInt(br.readLine());
d=n;
do
{
d=d/10;
y++;
}
while(d>0);
if(y>2*(r+c-2))
{
System.out.println("Wrong Entry !! The number can have a maximum of "+(2*(r+c-2))+" digits.");
System.exit(0);
}
do
{
x=x*10+n%10;
n=n/10;
}
while(n>0);
b=x;
if(r<c)
min=r;
else
min=c;
for(z=0;z<(min+1)/2;z++)
{
for(p=i;p<=j;p++)
{
if(a[i][p]!=0)
a[i][p]=b%10;
else
System.exit(0);
if(b==0)
b=x;
}
for(p=i+1;p<=k;p++)
{
if(a[p][j]!=0)
a[p][j]=b%10;
else
System.exit(0);
if(b==0)
b=x;
}
for(p=j-1;p>=i;p--)
{
if(a[k][p]!=0)
a[k][p]=b%10;
else
System.exit(0);
if(b==0)
b=x;
}
for(p=k-1;p>=i+1;p--)
{
if(a[p][i]!=0)
a[p][i]=b%10;
else
System.exit(0);
if(b==0)
b=x;
}
i++;j--;k--;
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
}
}