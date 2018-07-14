import java.io.*;  //Java Class Library
class check
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,c,tmp,x,p;
c=0;x=0;
System.out.println("Enter the no. of elements of array -->");
n=Integer.parseInt(br.readLine());
int a[]=new int[n];
int d[]=new int[n];
System.out.println("Enter the  "+n+" values one by one -->");
for(i=0;i<n;i++)
a[i]=Integer.parseInt(br.readLine());
System.out.println("The given array -->");
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
System.out.println();
for(i=0;i<n;i++)
{
for(j=0;j<(n-1)-i;j++)
{
if(a[j]>a[j+1])
{
tmp=a[j];
a[j]=a[j+1];
a[j+1]=tmp;
}
}
}
for(j=0;j<=9;j++)
{
for(i=0;i<n;i++)
{
if(a[i]==j)
{
c++;
break;
}
}
}
int b[]=new int[c];
for(j=0;j<=9;j++)
{
for(i=0;i<n;i++)
{
if(a[i]==j)
{
b[x]=j;
x++;
break;
}
}
}
for(i=0;i<n;i++)
d[i]=b[0];
System.out.println("Possible Permutations -->");
i=n-1;
while((d[0]!=b[c-1])&&(d[n-1]!=b[c-1]))
{
for(p=0;p<c-1;p++)
{
if(d[i]==b[p])
{
for(j=0;j<n;j++)
System.out.print(d[j]);
System.out.println();
d[i]=b[p+1];
if(i!=n-1)
{
i=n-1;
p=0;
}
}
}
if(d[i]==b[c-1])
{
for(j=0;j<n;j++)
System.out.print(d[j]);
System.out.println();
d[i]=b[0];
i--;
}
}
}
}