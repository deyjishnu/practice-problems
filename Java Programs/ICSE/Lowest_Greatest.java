class Lowest_Greatest
{
public static void main(String args[])
{
int i,j,low,high;
int a[][]={{7,8,9},{4,5,6},{1,2,3}};
low=a[0][0];
high=a[0][0];
System.out.println("Original Matrix:");
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
System.out.print(a[i][j]+"  ");
if(a[i][j]<low)
low=a[i][j];
if(a[i][j]>high)
high=a[i][j];
}
System.out.println();
}
System.out.println("Lowest number is :"+low);
System.out.println("Highest number is :"+high);

}
}