// To search a given integer from an array using binary search technique
import java.io.*;
class Binary_Search
{
    public void search()throws IOException
    {
    int n,i,x,ll,ul,p,c;
    n=c=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the number of integers -->"); 
    n=Integer.parseInt(br.readLine());
    ll=0;ul=n-1;
    int a[]=new int[n];
    System.out.println("Enter the numbers one by one in ascending order -->");
    for(i=0;i<n;i++)
    a[i]=Integer.parseInt(br.readLine());    // Entering values
    System.out.println("Enter the number to be searched -->");
    x=Integer.parseInt(br.readLine());
    // Searching begins
    while(ll<=ul)
    {
        p=(ll+ul)/2;
        if(x<a[p])
        ul=p-1;
        if(x>a[p])
        ll=p+1;
        if(x==a[p])
        {
            System.out.println("Search Successful. Found at "+(p+1)+"th position.");
            c=1;
            break;
        }
    }
    if(c==0)  //Counter to check whether the element is present or not
    System.out.println("Search Unsuccessful.");
    }
}