//To find the min. and max. value of a 2D array;also print the even & odd nos.
import java.io.*;
class array
{
 int a[][]=new int[3][3];
public void accept()throws IOException
    {
    int i,j;         
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter the numbers in the 3*3 array -->");
          for(i=0;i<3;i++)
          {
              for(j=0;j<3;j++)
              a[i][j]=Integer.parseInt(br.readLine());
          }
    }
public void minmax() //TO FIND THE MINIMUM VALUE AND MAXIMUM VALUE            
       {  
        int i,j,min,max;
        min=max=a[0][0];
          for(i=0;i<3;i++)
          {
              for(j=0;j<3;j++)
              {
                  if(a[i][j]<min)
                  min=a[i][j];
                  if(a[i][j]>max)
                  max=a[i][j];
              }
          }
          System.out.println("Min value = "+min);
          System.out.println("Max value = "+max);
        }
public void evenodd()
        {
         int i,j;
         System.out.print("\n Even numbers --> ");
          for(i=0;i<3;i++)
          {
              for(j=0;j<3;j++)
              {
                  if(a[i][j]%2==0)
                  System.out.print(a[i][j]+"  ");
              }
            }
            System.out.print("\n Odd numbers --> ");
          for(i=0;i<3;i++)
          {
              for(j=0;j<3;j++)
              {
                  if(a[i][j]%2!=0)
                  System.out.print(a[i][j]+"  ");
              }
            }
        }
    }
            
            
            
            