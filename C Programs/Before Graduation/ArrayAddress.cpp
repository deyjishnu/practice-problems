#include <stdio.h>
#include <conio.h>
main()
{
	int *p,a[10];
	printf("Addresses of array elements -->\n\n");
	printf("Array element         Address\n");
	printf("-----------------------------\n");
	for(int i=0;i<=9;i++)
	{
		p=&a[i];
		printf("    a[%d]              %u\n",i,p);
	}
	getchar();
}
