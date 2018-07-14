/*Create a file TEST and save 1 to 10 in it
  Reopen file TEST for reading( If error occurs, check for null)
  If the file exists, read numbers 1 to 10 and print them(Check for end of file while reading
  */

#include <stdio.h>

main()
{
	char filename[10];
	FILE *fp1;
	int i,n;
	
	fp1=fopen("TEST","w");
	for(i=1;i<=10;i++)
	putw(i,fp1);
	
	fclose(fp1);
	
	printf("\nInput Filename -->\n");
	
	open_file:
		scanf("%s",filename);
		fp1=fopen(filename,"r");
		if(fp1==NULL)
		{
			printf("\nCannot open file\nType file name again\n");
			goto open_file;
		}
		
		else
		{
			for(i=1;i<=20;i++)
			{
				n=getw(fp1);
				if(feof(fp1))
				{
					printf("\nRan out of data\n");
					break;
				}
				else
				{
					printf("%d\n",n);
				}
			}
		}
	
	fclose(fp1);
}
