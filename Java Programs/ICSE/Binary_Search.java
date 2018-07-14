import java.io.*;
class Binary_Search
{
public static void main(String args[])throws IOException
{
int i,j,tmp,v,h,l,f=0,m=0;
int a[]=new int[5];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//value accept
System.out.println("Enter the values");
for(i=0;i<5;i++)
{
a[i]=Integer.parseInt(br.readLine());
}
//sorting begins
for(i=0;i<5;i++)
{
for(j=0;j<4-i;j++)
{
if(a[j]>a[j+1])
{
tmp=a[j];
a[j]=a[j+1];
a[j+1]=tmp;
}
}
}
System.out.println("Sorted Values are:-");
for(i=0;i<5;i++)
System.out.println(a[i]+"\n");
System.out.println("Enter the values to be searched");
v=Integer.parseInt(br.readLine());
//main part of binary search
h=4;
l=0;
m=(h+l)/2;
while((f==0)&&(h>=l))
{
if(v==a[m])
{
f=1;
break;
}
if(v<a[m])
h=m-1;
else
l=m+1;
m=(h+l)/2;
}
if(f==1)
System.out.println("The specified value is found");
else
System.out.println("The specified value is not found");
}
}