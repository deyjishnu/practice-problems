#include <stdio.h>
#include <conio.h>
main()
{
	char s[10];
	int a=0,b=0,i,j;
	
	printf("Enter a sentence -->\n");
	gets(s);
	
	printf("Reversed all words in the sentence -->\n");
	for(i=0;s[i-1]!='\0';i++)
	{
		a=b;
		if(s[i]==' ' || s[i]=='\0')
		{
			b=i;
			for(j=b-1;j>=a;j--)
			printf("%c",s[j]);
		}
	}
}
