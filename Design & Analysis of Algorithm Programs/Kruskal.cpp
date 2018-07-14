#include <stdio.h>
#include <conio.h>
int i,j,n,min,x,y,min_cost=0,p=1,u,v;
	int a[50][50];
int find(int);
int uni(int,int);
int parent[50];
int main()
{
	
	printf("Enter the number of vertices --> ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
			if(i<j)
			{
				printf("Edge(%d,%d)--> ",i,j);
				scanf("%d",&a[i][j]);
				a[j][i]=a[i][j];
	    	}
	    	if(i==j)
	    	a[i][j]=999;
	    	if(a[i][j]==0)
	    	a[i][j]=999;
		}
	}
    printf("\nThe adjacency matrix -->\n");
    for(i=0;i<n;i++)
    {
    	for(j=0;j<n;j++)
    	printf("%d ",a[i][j]);
      	printf("\n");
    }
    while(p<n)
    {
    	for(i=0,min=999;i<n;i++)
    	{
    		for(j=0;j<n;j++)
    		{
    			if(a[i][j]<min)
    			{
    				min=a[i][j];
    				u=x=i;
    				v=y=j;
				}
			}
		}
		u=find(u);
		v=find(v);
		if(uni(u,v))
		{
			printf("%d edge %d %d",p++,u,v,min);
			min_cost+=min;
			a[x][y]=a[y][x]=999;
		}
		printf("Minimum Cost --> %d",min_cost);
		getch();
	}
		getch();
		return 0;
}
int find(int c)
{
	while(parent[c])
	c=parent[c];
	return c;
}
int uni(int x,int y)
{
	{
		if(x!=y)
		{
			parent[x]=y;
			return 1;
		}
		return 0;
	}
}
