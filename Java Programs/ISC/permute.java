import java.io.*;
class permute
{
public void accept()throws IOException
{
int n,i,j,x,p,c=0,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number -->");
n=Integer.parseInt(br.readLine());
x=n;
while(x!=0)
{
x=x/10;
c++;
}
int a[]=new int[c];
i=0;
while(n!=0)
{
a[i]=n%10;
n=n/10;
i++;
}
System.out.println("jkj"+c);
System.out.println("Different permutations -->");
for(i=0;i<c;i++)
{
k=1;
System.out.print(a[0]);
while(k!=c-1)
{
for(j=k;j<c;j++)
System.out.print(a[j]);
k++;
System.out.println();
}
System.out.println();
System.out.print(a[0]);
for(j=c-1;j>=1;j--)
System.out.print(a[j]);
System.out.println();
p=a[0];
for(j=0;j<c-1;j++)
a[j]=a[j+1];
a[c-1]=p;
}
}
}