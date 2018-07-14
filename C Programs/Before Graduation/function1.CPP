#include<stdio.h>
#include<conio.h>

int fact (int);

main()
{
    int a,f;

    printf ("Enter a number-->\n");
    scanf("%d",&a);

    f=fact(a);
    printf("Factorial = %d",f);
}

int fact (int b)
{
    int i,c=1;

    for (i=1;i<=b;i++)
    c=c*i;

    return(c);
}
