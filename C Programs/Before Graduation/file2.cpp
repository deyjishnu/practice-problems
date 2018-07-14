#include <stdio.h>
main()
{
	FILE  *f1,*f2,*f3;
	int i,n;
	
	printf("Enter 30 whole numbers -->\n");
	f1=fopen("DATA","w");
	for(i=1;i<=30;i++)
	{
		if(n<0)
		break;
		scanf("%d",&n);
		putw(n,f1);
	}
	
	fclose(f1);
	
	f1=fopen("DATA","r");
	f2=fopen("EVEN","w");
	f3=fopen("ODD","w");
	
	for(i=1;i<=30;i++)
	{
		n=getw(f1);
		if(n%2==0)
		putw(n,f2);
		else
		putw(n,f3);
		if(n== EOF)
		break;
	}
	
	fclose(f1);
	fclose(f2);
	fclose(f3);
	
    printf("\n\nOutput -->\n");
    f2=fopen("EVEN","r");
	f3=fopen("ODD","r");
	printf("EVEN File Contents -->\n");
	while((n=getw(f2))!= EOF)
	printf("%d ",n);
	printf("\nODD File Contents -->\n");
	while((n=getw(f3))!= EOF)
	printf("%d ",n);
	
	getchar();
}
