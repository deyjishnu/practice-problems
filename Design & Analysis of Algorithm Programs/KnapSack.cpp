#include <stdio.h>
#include <conio.h>
int main()
{
	int n,i,j;
	float r[50],sum=0,sumw=0,mw,p[50],w[50],temp1,temp2;
	printf("Enter the number of items --> ");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("Enter the weight of each item --> ");
	    scanf("%f",&w[i]);
	}
    for(i=0;i<n;i++)
	{
		printf("Enter the price of items in order --> ");
	    scanf("%f",&p[i]);
	}
	printf("Enter the capacity --> ");
	scanf("%f",&mw);
	for(i=0;i<n;i++)
	r[i]=p[i]/w[i];
	for(i=0;i<n-1;i++)
	{
	    for(j=0;j<n-1-i;j++)
	    {
	    	if(r[j]<r[j+1])
	    	{
	    		temp1=r[j];
	    		r[j]=r[j+1];
	    		r[j+1]=temp1;
                temp2=w[j];
	    		w[j]=w[j+1];
	    		w[j+1]=temp2;
			}
		}
	}
	printf("Sorted -->\n");
	for(i=0;i<n;i++)
	printf("%f ",r[i]);
	for(i=0;i<n;i++)
	{
		if(w[i]>mw)
		break;	
		else
		{
		sum=sum+(r[i]*w[i]);
		mw=mw-w[i];
		}
	}
	float x;
	if(i<n)
	{
		x=mw*r[i];
		sum+=x;
	}
	printf("Sum= %f",sum);
	return 0;
}
