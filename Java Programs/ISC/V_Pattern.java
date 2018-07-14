//prog. to accept a (3X5) array [int]. Print the integers in the cells at the V position, in a V pattern. Print the sum of those integers.
import java.io.*;
class V_Pattern
{
     int a[][]=new int[3][5];         //Array initialised
     int i,j,sum=0;
     public void accept()throws IOException
     {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));         //Activating Buffer
        System.out.println("Enter values for 3x5 array ");
        for(i=0;i<3;i++)
        {
            for(j=0;j<5;j++)
            a[i][j]=Integer.parseInt(br.readLine());  //To Accept the values
        }
    }
    public void display()
    {
        System.out.println("Display 3x5 array in original form ");          //Print the original array
        for(i=0;i<3;i++)
        {
            for(j=0;j<5;j++)
            System.out.print(a[i][j]+" ");
            System.out.println();
        }
        System.out.println("V pattern display is ");               //Print the V pattern
        for(i=0;i<3;i++)
        {
            for(j=0;j<5;j++)
            {
                if((i==j)||(i+j==4))            //Condition
                {
                System.out.print(a[i][j]);
                sum=sum+a[i][j];
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Sum of the cells of V pattern "+sum);      //Print the sum of the v-pattern   
        }
    }      