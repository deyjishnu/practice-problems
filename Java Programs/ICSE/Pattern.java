import java.io.*;
class Pattern
{
public static void main(String args[])throws IOException
{
int i,j,k=0;
for(i=0;i<4;i++)
{
for(j=0;j<=i;j++)
{
if(i%2==0)
{
System.out.print('*');
k=1;
}
if(k==1)
System.out.print('#');
System.out.print('#');
}
System.out.println();
}
}
}
