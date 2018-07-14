//a menu driven program and accept a 2D array of same no. of rows and columns and print the upper triangle or lower triangle according to the user's choice
import java.io.*;
class Diagonal_Matrix
{
int n,i,j,ch;
public void acceptDisplay()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a number which indicates rows and columns of a square matrix ");
n=Integer.parseInt(br.readLine());
int a[][]=new int[n][n];   //Array initialised
System.out.println("Enter the numbers -->");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());    //Assigning values in the array
}
System.out.println("**********DISPLAY THE ORIGINAL MATRIX**********");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
System.out.println("..........MAIN MENU..........");
System.out.println("Type '1' to print the upper diagonal part");
System.out.println("Type '2' to print the lower diagonal part");
System.out.println("Now.....Type your option ");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:    //upper diagonal part of the matrix
System.out.println("The upper diagonal part of the matrix");
for(i=0;i<n;i++)
{
for(j=0;j<i;j++)
System.out.print("  ");
for(j=i;j<n;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
break;
case 2:     //lower diagonal part of the matrix
System.out.println("The lower diagonal part of the matrix");
for(i=0;i<n;i++)
{
for(j=0;j<=i;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
break;
default:    //Default case
System.out.println("Wrong input! Try again");
}
}
}
