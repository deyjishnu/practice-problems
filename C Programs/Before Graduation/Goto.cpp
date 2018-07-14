//program to illustrate the working of goto statement by printing 10 positive numbers

#include <stdio.h>
main()
{
	int i=1,n;
	printf("Enter 10 positive numbers -->\n");
	read:
		scanf("%d",&n);
		if(n>0)
		{
			printf("This is a positive number\n");
			i=i+1;
		}
		else
	    printf("Sorry !! This is not a positive number\n");
	    if(i<=10)
	    goto read;
}
