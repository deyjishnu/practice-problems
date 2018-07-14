//program to check whether a number is prime or not using goto

#include <stdio.h>
#include <stdlib.h>
main()
{
	int i=2,n,c=0;
	printf("Enter a number -->\n");
	scanf("%d",&n);
	
	if(n==1)
	{
		printf("The number is not prime");
		exit(0);
	}
	
	divide:
		if(i==n)
		goto check;
		if(n%i==0)
		{
			c=1;
			goto check;
		}
		else
		{
			i++;
			goto divide;
		}
		
	check:
		if(c==0)
		printf("The number is prime");
		else
		printf("The number is not prime");
}
