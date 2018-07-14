class Row_Col_Add
{
public static void main(String args[])
{
int i,j,sum_row=0,sum_col=0,sum_ld=0,sum_rd=0,m=2;
int a[][]={{7,8,9},{4,5,6},{1,2,3}};
System.out.println("Original Matrix:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
System.out.print(a[i][j]+"  ");
System.out.println();
}
System.out.println();
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
sum_row+=a[i][j];
System.out.print("sum of "+(i+1)+" row is ="+sum_row);
sum_row=0;
System.out.println();
}
System.out.println();
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
sum_col+=a[j][i];
System.out.print("Sum of "+(i+1)+" coloumn is ="+sum_col);
sum_col=0;
System.out.println();
//compute the value of diagonal cells from left to right
for(i=0;i<3;i++)
sum_ld+=a[i][i];
System.out.print("Sum of left diagonal value is = "+sum_ld);
System.out.println();
for(i=0;i<3;i++)
{
sum_rd+=a[i][m];
m--;
}
System.out.print("sum of right diagonal value is = "+sum_rd);
System.out.println();
}
}
}