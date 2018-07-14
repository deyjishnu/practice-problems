class Transpose
{
public static void main(String args[])
{
int i,j;
int a[][]={{7,8,9},{4,5,6},{1,2,3}};
System.out.println("Original Matrix:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
System.out.print(a[i][j]+"  ");
System.out.println();
}
System.out.println("Transpose Matrix:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
System.out.print(a[j][i]+"  ");
System.out.println();
}
}
}