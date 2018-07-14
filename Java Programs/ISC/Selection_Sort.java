// To arrange numbers in ascending order using Selection sort
import java.io.*;
class Selection_Sort
{
    public void sort()throws IOException
    {
    int n,i,j,min,tmp;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of integers to be sorted -->"); 
    n=Integer.parseInt(br.readLine());
    int a[]=new int[n];
    System.out.println("Enter the numbers one by one -->");
    for(i=0;i<n;i++)
    a[i]=Integer.parseInt(br.readLine());
    // Sorting begins
    for(i=0;i<n-1;i++)
    {
      min=i;
      for(j=i+1;j<n;j++)
      {
        if(a[j]<a[min])
        min=j;
      }
      tmp=a[i];
      a[i]=a[min];
      a[min]=tmp;
    }
    // Printing begins
    System.out.println("The required ascending order -->");
    for(i=0;i<n;i++)
    System.out.println(a[i]);
    }
}