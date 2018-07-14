#include <stdio.h>
#include <conio.h>
main()
{
	char s[20];
	int i,l;
	
	printf("Enter a sentence -->\n");
	gets(s);
	
	printf("Reversed sentence -->\n");
	for(l=0;s[l]!='\0';l++);
	for(i=l-1;i>=0;i--)
	printf("%c",s[i]);
}
