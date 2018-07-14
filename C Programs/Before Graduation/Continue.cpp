//program to calculate the square roots of 10 numbers using continue statement

#include <stdio.h>
#include <math.h>
main()
{
	
	int n,i=1;
	double sq;

	printf("Enter 10 numbers -->\n");
	
	while(i<=10)
	{
		scanf("%d",&n);
		if(n<0)
		{
			printf("Sorry !! Enter a positive number.\n");
			continue;
		}	
		else
		{
			sq=sqrt((double)n);
			printf("%2.2f\n",sq);
			i=i+1;
		}
	}
	
	getchar();
}
