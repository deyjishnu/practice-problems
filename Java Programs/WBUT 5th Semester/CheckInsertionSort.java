import java.io.*;
class CheckInsertionSort
{
    public static void main(String args[])throws IOException
    {
        int n,b[];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of integers -->");
        n=Integer.parseInt(br.readLine());
        b=new int[n];
        System.out.println("Enter the integers -->");
        for(int i=0;i<n;i++)
        b[i]=Integer.parseInt(br.readLine());
        InsertionSort obj=new InsertionSort();
        obj.isort(b);
        System.out.println("Sorted array -->");
        for(int i=0;i<n;i++)
        System.out.print(b[i]+" ");
    }
}