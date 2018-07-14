// To arrange numbers in ascending order using Bubble sort
import java.io.*;
class Bubble_Sort
{
    public void sort()throws IOException
    {
    int n,i,j,tmp;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the numbers of integers to be sorted -->"); 
    n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    System.out.println("Enter the numbers -->");
    for(i=0;i<n;i++)
    a[i]=Integer.parseInt(br.readLine());
    // Sorting begins
    for(i=0;i<n;i++)
    {
      for(j=0;j<n-1-i;j++)
      {
        if(a[j]>a[j+1])
        {
        tmp=a[j];
        a[j]=a[j+1];
        a[j+1]=tmp;
        }
      }
    }
    // Printing begins
    System.out.println("The required ascending order -->");
    for(i=0;i<n;i++)
    System.out.println(a[i]);
    }
}