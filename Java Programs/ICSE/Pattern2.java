class Pattern2
{
public static void main(String args[])
{
int i,j,m;
m=5;
for(i=0;i<5;i++)  //HOLDING ROW
{
for(j=0;j<m;j++)  //CREATE BLANK SPACES FROM LEFT
System.out.print(" ");
for(j=0;j<=i;j++)  //PRINT CHARACTER IN A ROW
System.out.print("* ");
m--;
System.out.println(); //CREATE NEW LINE
}
}
}