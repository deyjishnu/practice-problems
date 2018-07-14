#include <stdio.h>
#include <conio.h>
main()
{
    int b,c=0,n,i;
    struct stud
    {
        char name[10];
        int per,roll;
        char g;
    }
    a[100];
    printf("Enter the number of students\n");
    scanf ("%d",&n);
    for(i=0;i<n;i++)
    {
        printf("Enter the name\n");
        scanf("%s",a[i].name);
        printf("Enter the roll\n");
        scanf("%d",&a[i].roll);
        printf("Enter the percentage\n");
        scanf("%d",&a[i].per);
    }
    for (i=0;i<n;i++)
    {
        b=a[i].per;
        if(b>90)
        a[i].g='A';
        else if(b<=90 && b>=70)
        a[i].g='B';
        else if(b<70)
        a[i].g='C';
    }
    printf("---------------------------------\nDATA\n---------------------------------\n");
    for (i=0;i<n;i++)
    {
        printf ("Name -->");
        puts (a[i].name);
        printf ("Roll --> %d\nPercentage --> %d\nGrade --> %c\n\n",a[i].roll,a[i].per,a[i].g);
        if (a[i].g=='A')
        c++;
    }
    printf("Number of students having grade A is %d",c);
}
