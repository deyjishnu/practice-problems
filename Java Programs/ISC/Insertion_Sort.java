// To arrange numbers in ascending order using Insertion sort
import java.io.*;
class Insertion_Sort
{
    public void sort()throws IOException
    {
    int n,i,p,tmp;
    int a[]=new int[20];
    a[0]=-999;   //Storing highly negative no. in the initial cell
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of integers to be sorted -->"); 
    n=Integer.parseInt(br.readLine());
    System.out.println("Enter the numbers one by one -->");
    for(i=1;i<=n;i++)
    a[i]=Integer.parseInt(br.readLine());   //Entering values
    // Sorting begins
    for(i=1;i<=n;i++)
    {
      tmp=a[i];  //Storing a[i] temporarily
      p=i-1;
      while(a[p]>tmp)
      {
          a[p+1]=a[p];    //Interchanging values
          p--;
      }
      a[p+1]=tmp;
    }
    // Printing begins
    System.out.println("The required ascending order -->");
    for(i=1;i<=n;i++)
    System.out.println(a[i]);
    }
}