#include<stdio.h>
#include<conio.h>
main()
{
    int i=0;
    char *p;
    printf ("Enter the name\n");
    gets(p);
    while(*p!='\0')
    {
        i++;
        p++;
    }
    printf("Name length is %d",i);
}
