import java.io.*;
class HeapSort
{
    private int n,heapsize;
    HeapSort obj=new HeapSort();
    int left(int i)
    {
        return 2*i;
    }
    int right(int i)
    {
        return (2*i)+1;
    }
    int parent(int i)
    {
        return i/2;
    }
    int swap(int a[],int x,int y)
    {
        int temp;
        temp=a[x];
        a[x]=a[y];
        a[y]=temp;
    }
    void buildmaxheap(int a[])
    {
        for(int i=n/2;i>=1;i--)
        obj.maxheapify(a,i);
    }
    void maxheapify(int a[],int i)
    {
        int l,r,largest;
        l=obj.left(i);
        r=obj.right(i);
        if(l<=obj.heapsize && a[l]>a[i])
        largest=l;
        else
        largest=i;
        if(r<=obj.heapsize && a[r]>a[largest])
        largest=r;
        if(largest!=i)
        {
            obj.swap(a,i,largest);
            obj.maxheapify(a,largest);
        }
    }
    void hsort(int a[])
    {
        obj.buildmaxheap(a);
        while(obj.heapsize>=0)
        {
            obj.swap(a,1,obj.heapsize);
            obj.heapsize--;
            obj.maxheapify(a,1);
        }
    }
    public static void main(String args[])throws IOException
    {
        int a[];
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        HeapSort obj2=obj;
        System.out.println("Enter the number of nodes -->");
        obj2.n=Integer.parseInt(br.readLine());
        obj2.n++;
        obj2.heapsize=obj2.n;
        a=new int[obj2.n];
        System.out.println("Enter the values at nodes -->");
        for(int i=1;i<obj2.n;i++)
        a[i]=Integer.parseInt(br.readLine());
        obj2.hsort(a);
        System.out.println("Sorted array -->");
        for(int i=0;i<obj2.n;i++)
        System.out.print(a[i]+" ");
    }
}