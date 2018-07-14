import java.io.*;
class MergeSort
{
    void merge(int l[],int r[],int a[])
    {
        int nl=l.length,nr=r.length,i=0,j=0,k=0;
        while(i<nl && j<nr)
        {
            if(l[i]<=r[j])
            a[k++]=l[i++];
            else
            a[k++]=r[j++];
        }
        while(i<nl)
        a[k++]=l[i++];
        while(j<nr)
        a[k++]=r[j++];
    }
    void mergesort(int a[])
    {
        int n=a.length,i,mid;
        if(n<2)
        return;
        else
        {
            mid=n/2;
            int l[]=new int[mid];
            int r[]=new int[n-mid];
            for(i=0;i<mid;i++)
            l[i]=a[i];
            for(i=mid;i<n;i++)
            r[i-mid]=a[i];
            mergesort(l);
            mergesort(r);
            merge(l,r,a);
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
        MergeSort obj=new MergeSort();
        obj.mergesort(a);
        System.out.println("Sorted array -->");
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}