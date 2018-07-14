#include<stdio.h>
#include<conio.h>
main()
{
    int i,j,r,c;
    int a[50][50],b[50][50];
    printf("Enter the number of rows and columns -->\n");
    scanf("%d %d",&r,&c);
    printf("Enter the elements of first array -->\n");
    for(i=0;i<r;i++)
    {
        for (j=0;j<c;j++)
        scanf ("%d",&a[i][j]);
    }
    printf("Enter the elements of second array -->\n");
    for(i=0;i<r;i++)
    {
        for (j=0;j<c;j++)
        scanf ("%d",&b[i][j]);
    }
    printf("Sum of first and second array -->\n");
    for(i=0;i<r;i++)
    {
        for (j=0;j<c;j++)
        printf("%d  ",(a[i][j]+b[i][j]));
        printf("\n");
    }
}
