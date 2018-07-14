//prog to accept a square int D.D.A and find its central element. The array should contain odd nos. of row elements.Print the above,below,left and right elements of the central element and the sum of them
import java.io.*;
class sum_of_central_surrounding_elements
{
public void acceptDisplay()throws IOException
{
int n,x,i,j,sum;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of rows and columns(odd) -->");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];     //Declaring the array
System.out.println("Enter the "+(n*n)+" values -->");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());//entering the values in the array
}
System.out.println("The given array -->");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
x=(n-1)/2;     //Central row no.(= central column no.)
System.out.println("Central Element = "+a[x][x]);
System.out.println("Right Element = "+a[x][x+1]);
System.out.println("Left Element = "+a[x][x-1]);
System.out.println("Above Element = "+a[x-1][x]);
System.out.println("Below Element = "+a[x+1][x]);
sum=a[x][x-1]+a[x][x+1]+a[x-1][x]+a[x+1][x];
System.out.println("The required sum = "+sum);
}
}