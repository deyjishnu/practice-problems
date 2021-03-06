import java.io.*;
class IllustratingInsertionSort
{
    void isort(int a[])
    {
        int n=a.length,temp;
        double c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j>0 && a[j]<a[j-1];j--)
            {
                temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                c++;
            }
        System.out.print("Key "+i+" --> ");
        for(int k=0;k<n;k++)
        System.out.print(a[k]+" ");
        System.out.println();
        if((c/n)<1)
        System.out.println("Total number of iterations --> "+c);
        else if((c/n)==1)
        System.out.println("Total number of iterations --> n");
        else if((c/n)==n)
        System.out.println("Total number of iterations --> n^2");
        else
        System.out.println("Total number of iterations --> "+(c/n)+"n");
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
        IllustratingInsertionSort obj=new IllustratingInsertionSort();
        obj.isort(a);
        System.out.println("Sorted array -->");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}