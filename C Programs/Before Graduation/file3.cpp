/*
Write a program to open a file named INVENTORY and store it in the following data :

Item name     Number      Price      Quantity
----------------------------------------------
  AAA-1         111       17.50         115
  BBB-2         125       36.00         75
  C-3           247       31.75         104
  
  Extend the program to read this data from the file INVENTORY and display the inventory table with the value of each item.
*/
#include <stdio.h>

main()
{
	FILE *fp;
	int n,q,i;
	float p,v;
	char s[10];
	
	fp=fopen("INVENTORY.txt","w");
	
	printf("Enter data -->\nItemName   Number  Price  Quantity\n");
	for(i=1;i<=3;i++)
	{
		scanf("%s %d %f %d",&s,&n,&p,&q);
		fprintf(fp,"%s %d %f %d",s,n,p,q);
	}
	
	fclose(fp);
	fp=fopen("INVENTORY.txt","r");
	
	printf("\n\nINVENTORY -->\n");
	printf("ItemName   Number   Price   Quantity   Value\n");
	for(i=1;i<=3;i++)
	{
		fscanf(fp,"%s %d %f %d",&s,&n,&p,&q);
		v=p*q;
		printf("%8s %8d %6.2f %8d %12.2f\n",s,n,p,q,v);
	}
	
	fclose(fp);
	
	getchar();
}
