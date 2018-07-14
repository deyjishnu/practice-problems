import java.io.*;
class InsertionSort
{
    void isort(int a[])
    {
        int n=a.length,temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>0 && a[j]<a[j-1];j--)
            {
                temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
    }
    public static void main(String args[])throws IOException
    {
        int n,a[];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of integers -->");
        n=Integer.parseInt(br.readLine());
        a=new int[n];
        System.out.println("Enter the integers -->");
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
        InsertionSort obj=new InsertionSort();
        obj.isort(a);
        System.out.println("Sorted array -->");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}