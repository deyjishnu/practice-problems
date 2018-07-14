#include <stdio.h>
main()
{
	FILE *p;
	char ch;
	
	printf("Data Input (Enter 10 characters) -->\n");
	p=fopen("INPUT.txt","w");
	/**while((ch=getchar()) != EOF)
	putc(ch,p);
	instead of line nos. 12-16 */
	for(int i=1;i<=10;i++)
	{
		ch=getchar();
		putc(ch,p);
	}
	
	fclose(p);
	
	printf("\n\nData Output -->\n");
	p=fopen("INPUT.txt","r");
	while((ch=getc(p)) != EOF)
	printf("%c",ch);
	getchar();
}
