#include <stdio.h>
#include <conio.h>
main()
{
	char s1[10],s2[10];
	int i,l,k;
	
	printf("Enter a word -->\n");
	gets(s1);
	
	for(l=0;s1[l]!='\0';l++);
	
	for(i=l-1,k=0;i>=0;i--,k++)
	s2[k]=s1[i];
	s2[l]='\0';
	
	for(i=k=0;i<l;i++)
	{
		if(s1[i]!=s2[i])
		{
			k=1;
			break;
		}
	}
	
	if(k==0)
	printf("PALINDROME");
	else
	printf("NOT PALINDROME");
}
