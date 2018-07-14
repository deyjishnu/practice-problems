#include<stdio.h>
#include<conio.h>
void mergesort(int [],int,int);
void mergearray(int [],int,int,int);
int main()
{
int a[50],n,i;
printf("enter how many numbers?\n");
scanf("%d",&n);
printf("enter elements\n");
for(i=0;i<n;i++)
scanf("%d",&a[i]);
mergesort(a,0,n-1);
 for(i=0;i<n;i++)
      printf("\t%d",a[i]);
getch();
return 0;
}
void mergesort(int a[],int beg,int end)
  {
   int mid;
   if(beg<end)
   {
     mid=(beg+end)/2;
     mergesort(a,beg,mid);
     mergesort(a,mid+1,end);
     mergearray(a,beg,mid,end);
     }

  }
 void mergearray(int a[],int beg,int mid,int end)
    {
       int b[50],i,j,k;
	for(i=beg;i<=end;i++)
	 b[i]=a[i];

       i=beg;
       j=mid+1;
       k=beg;

       while((i<=mid)&&(j<=end))
       {
	  if(b[i]<b[j]){
	    a[k]=b[i];
	    i++;
	    k++;
	  }
	  else
	  {
	   a[k]=b[j];
	   j++;
	   k++;
	  }
       }
       if(i<=mid)
       {
	 while(i<=mid)
	 {
	   a[k]=b[i];
	   i++;k++;
	 }
       }
       else
       {
	  while(j<=end)
	  {
	   a[k]=b[j];
	   j++;
	   k++;
	  }
       }
    
    }
/*enter how many numbers?
5
enter elements
5
4
1
2
3
        1       2       3       4       5
*/
