import java.io.*;
class HeapSort2
{
    private static int n,heapsize;
    static int left(int i)
    {
        return 2*i;
    }
    static int right(int i)
    {
        return (2*i)+1;
    }
    static int parent(int i)
    {
        return i/2;
    }
    static void swap(int a[],int x,int y)
    {
        int temp;
        temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    static void buildmaxheap(int a[])
    {
        for(int i=n/2;i>=1;i--)
        maxheapify(a,i);
    }
    static void maxheapify(int a[],int i)
    {
        int l,r,largest;
        l=left(i);
        r=right(i);
        if(l<=heapsize && a[l]>a[i])
        largest=l;
        else
        largest=i;
        System.out.println("n="+n+" heapsize="+heapsize+" i="+i+" l="+l+" r="+r+" largest="+largest);
        if(r<=heapsize && a[r]>a[largest])
        largest=r;
        if(largest!=i)
        {
            swap(a,i,largest);
            maxheapify(a,largest);
        }
    }
    static void hsort(int a[])
    {
        buildmaxheap(a);
        while(heapsize>=1)
        {
            swap(a,1,heapsize);
            heapsize--;
            maxheapify(a,1);
        }
    }
    public static void main(String args[])throws IOException
    {
        int a[];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of nodes -->");
        n=Integer.parseInt(br.readLine());
        n++;
        heapsize=n-1;
        a=new int[n];
        System.out.println("Enter the values at nodes -->");
        for(int i=1;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
        hsort(a);
        System.out.println("Sorted array -->");
        for(int i=1;i<n;i++)
        System.out.print(a[i]+" ");
    }
}