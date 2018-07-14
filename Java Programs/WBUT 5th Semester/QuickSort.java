import java.io.*;
class QSort
{
    int partition(int a[],int start,int end)
    {
        int temp;
        int pivot=a[end];
        int pindex=start;
        for(int i=start;i<end;i++)
        {
            if(a[i]<=pivot)
            {
                temp=a[i];
                a[i]=a[pindex];
                a[pindex]=temp;
                pindex++;
            }
        }
        temp=a[end];
        a[end]=a[pindex];
        a[pindex]=temp;
        return pindex;
    }
    void quickSort(int a[],int start,int end)
    {
        int pindex;
        if(start<end)
        {
            pindex=partition(a,start,end);
            QSort ob=new QSort();
            ob.quickSort(a,start,pindex-1);
            ob.quickSort(a,pindex+1,end);
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
        QSort obj=new QSort();
        obj.quickSort(a,0,n-1);
        System.out.println("Sorted array -->");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}