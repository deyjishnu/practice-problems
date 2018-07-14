#include <stdio.h>
#include <conio.h>
void q_sort(int,int);
int partition(int,int);
int c;
int a[100];
int main()
{
    c=0;
    int i,j,n;
    printf("Enter the no. of elements --> ");
    scanf("%d",&n);
    printf("Enter the numbers -->");
    for(i=0;i<n;i++)
    scanf("%d",&a[i]);
    q_sort(0,n-1);
    printf("Sorted Array -->\n");
    for(i=0;i<n;i++)
    printf("%d ",a[i]);
    getch();
    return 0;
}
void q_sort(int beg,int end)
{
    int m;
    if(beg<end)
    {
        m=partition(beg,end);
        q_sort(beg,m-1);
        q_sort(m+1,end);
    }
}
int partition(int l,int h)
{
    int x,j,i,t;
    x=a[h];i=l-1;
    for(j=1;j<h;j++)
    {
                    c++;
                    if(a[j]<=x)
                    {
                               i++;
                               t=a[i];
                               a[i]=a[j];
                               a[j]=t;
                    }
    }
    t=a[i+1];
    a[i+1]=a[h];
    a[h]=t;
    return i+1;
}

/*
Enter the no. of elements --> 5
Enter the numbers -->6
4
2
3
1
Sorted Array -->
1
2
3
4
6
*/
