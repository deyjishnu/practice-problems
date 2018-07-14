#include <stdio.h>
#include <conio.h>
main()
{
	char s[50];
	int i=0,j,c=-1;
	printf("Enter a name -->\n");
	gets(s);
	printf("Shorthand -->\n");
	printf("%c",s[0]);
	while(s[i]!='\0')
	{
		if((s[i]==' ')&&(s[i+1]!=' '))
		{
			printf(".%c",s[i+1]);
			c=i;
		}
		i++;
	}
	for(j=c+2;j<i;j++)
	printf("%c",s[j]);
}
