#include <stdio.h>
#include <conio.h>
main()
{
	int i,j;
	for(j=1;j<=5;j++)
	{
		for(i=1;i<j;i++)
		printf(" ");
		for(i=j;i<=5;i++)
		printf("*");
		printf("\n");
	}
}
