package intman;
public class arrman
{
int n,i,j,tmp;
    public int sort(int a[])
    { 
       n=a.length;
       for(i=0;i<n;i++)
       {
       for(j=0;j<n-1-i;j++)
       {
         if(a[j]>a[j+1])
         {
         tmp=a[j];    //Interchanging values
         a[j]=a[j+1];
         a[j+1]=tmp;
         }
       }
       }
       return(a);
       /*System.out.println("Sorted Array -->");
       for(i=0;i<n;i++)
       System.out.print(a[i]+"  ");*/
    }
}