#include<stdio.h>
#include<conio.h>
int main()
{
	int original[7], hamming[11],i,error[4],pos;
	printf("Enter the number in binary\n");
	for(i=0;i<7;i++)
	{
	scanf("%d",&original[i]);	
	}
	hamming[2]=original[6];
	hamming[4]=original[5];
	hamming[5]=original[4];
	hamming[6]=original[3];
	hamming[8]=original[2];
	hamming[9]=original[1];
	hamming[10]=original[0];

	if((hamming[2]+hamming[4]+hamming[6]+hamming[8]+hamming[10])%2==0)
	{
		hamming[0]=1;
	}
	else
	hamming[0]=0;
	if((hamming[2]+hamming[5]+hamming[6]+hamming[9]+hamming[10])%2==0)
	{
	hamming[1]=1;	
	}
	else
	hamming[1]=0;
	if((hamming[4]+hamming[5]+hamming[6])%2==0)
	{
		hamming[3]=1;
	}
	else
	hamming[3]=0;
	if((hamming[8]+hamming[9]+hamming[10])%2==0)
	{
	hamming[7]=0;	
	}
	else
	hamming[7]=0;
	for(i=0;i<11;i++)
	{
	printf("%d",hamming[i]);	
	}
	printf("\nEnter the positon of error");
	scanf("%d",&pos);
	if(hamming[pos-1]==0)
	hamming[pos-1]=1;
	else
	hamming[pos-1]=0;
	
	
	
	if((hamming[0]+hamming[2]+hamming[4]+hamming[6]+hamming[8]+hamming[10])%2==0)
	{
	error[0]=1;	
	}
	else
	error[0]=0;	
	if((hamming[1]+hamming[2]+hamming[5]+hamming[6]+hamming[9]+hamming[10])%2==0)
	{
	error[1]=1;		
	}
	else
	error[1]=0;	
	if((hamming[3]+hamming[4]+hamming[5]+hamming[6])%2==0)
	{
	error[2]=1;		
	}
	else
	error[2]=0;	
	if((hamming[7]+hamming[8]+hamming[9]+hamming[10])%2==0)
	{
	error[3]=1;		
	}
	else
	error[3]=0;	
	
for(i=0;i<4;i++)
{
	printf("\n%d",error[i]);
}		
	getch();
	return 0;
	
}

