#include<stdio.h>
#include<conio.h>
void prims();
int a[4][4],v[10];
int main()
{
    int i,j;
    printf("Enter the array\n");
    for(i=0;i<4;i++)
    {
    for(j=0;j<4;j++)
    {
    printf("Enter the value for %d%d\n",i,j);
    scanf("%d",&a[i][j]);
    }
    }
    printf("The whole array is \n");
    for(i=0;i<4;i++)
    {
    printf("\n");  
    for(j=0;j<4;j++)
    printf("%d ",a[i][j]);
    }
    prims();
    getch();
    return 0;
}
void prims()
{
    int min,p=1,i,j,min_cost=0,A,B;
    v[0]=1;
    while(p<4)
    {
              for(i=0,min=999;i<4;i++)
              for(j=0;j<4;j++)
              if(a[i][j]<min)
              if(v[i]!=0)
              {
                         min=a[i][j];
                         A=i;
                         B=j;
              }
    if(v[A]==0||v[B]==0)
    {
                        printf("\n Edge=%d %d",A,B);
                        min_cost+=min;
                        v[B]=1;
                        p++;
                        a[A][B]=a[B][A]=999;
    }
    
    }
    printf("Cost=%d",min_cost);
}
