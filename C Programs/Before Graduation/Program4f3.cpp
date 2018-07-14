#include <stdio.h>
#include <conio.h>
main()
{
	int i,j,l;
	printf("Enter the number of lines -->");
	printf("-----PATTERN-----\n");
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=(i+3);j++)
		{
			if((i+j)<5)
			printf(" ");
			else
			printf("*");
		}
		printf("\n");
	}
}
