//prog to declare a 2D array and solve the array columnwise using the selection sort technique(alternate sorting ie. if first column is in ascending order, second column in descending order)
import java.io.*;  //Java Class Library
class sorting_columnwise
{
public void acceptDisplay()throws IOException  //Value Accept
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int r,c,i,j,k,small,pos,tmp;
System.out.println("Enter the no. of rows of matrix -->");
r=Integer.parseInt(br.readLine());
System.out.println("Enter the no. of columns of matrix -->");
c=Integer.parseInt(br.readLine());
int a[][]=new int[r][c];
System.out.println("Enter the  "+(r*c)+" values one by one -->");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
a[i][j]=Integer.parseInt(br.readLine());
}
System.out.println("The given 2D array -->");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
//computation
for(k=0;k<c;k++) //column
{
   if(k%2==0)
    {
      for(i=0;i<r;i++)//ROW
      {
      small=a[i][k];
      pos=i;
       for(j=i+1;j<r;j++)//REMAINING ELEMENTS
         {
            if(a[j][k]<small)
             {
                small=a[j][k];
                pos=j;
              }
          }
                  tmp=a[pos][k];
                  a[pos][k]=a[i][k];
                  a[i][k]=tmp;
                }
            }
                else
                {
                    for(i=0;i<r;i++)//ROW
                    {
                    small=a[i][k];
                    pos=i;
                   for(j=i+1;j<r;j++)//REMAINING ELEMENTS
                   {
                    if(a[j][k]>small)
                    {
                    small=a[j][k];
                    pos=j;
                    }
                   }
                  tmp=a[pos][k];
                  a[pos][k]=a[i][k];
                  a[i][k]=tmp;
                }
            }
        }
        System.out.println("NOW THE REQUIRED ARRAY -->");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
    }
}