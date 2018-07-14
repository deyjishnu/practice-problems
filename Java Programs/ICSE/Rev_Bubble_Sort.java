import java.io.*;
class Rev_Bubble_Sort
{
public static void main(String args[])throws IOException
{
int i,j,tmp=0;
int a[]={5,3,8,4,9,2,1,12,98,16};
for(i=0;i<10;i++)
{
for(j=0;j<9-i;j++)
{
if(a[j]>a[j+1])
{
tmp=a[j];
a[j]=a[j+1];
a[j+1]=tmp;
}
}
}
for(j=0;j<10;j++)
{
System.out.println(a[j]);
System.out.println();
}
}
}