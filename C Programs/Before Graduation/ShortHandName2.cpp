#include <stdio.h>
#include <conio.h>
main()
{
	char s[50];
	int i=0,a;
	printf("Enter a name -->\n");
	gets(s);
	printf("Shorthand -->\n");
	while(s[i]!='\0')   //to convert lowercase letters to uppercase
	{
		a=(int)s[i];
		if(a>=97 && a<=122)
		s[i]=(char)(a-32);
		i++;
	}
	i=0;
	while(s[i]!='\0')     //to print the shorthand
	{
		if(s[i]==' ')
		printf("%c.",s[i+1]);
		i++;
	}
}
