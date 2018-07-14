#include<stdio.h>
#include<conio.h>
int fact(unsigned int);
void main()
{
clrscr();
int i;
printf(" enter a number \n");
scanf("%d",&i);
printf("the factorial of %d is %d ",i,fact(i));
getch();
}
int fact(unsigned int n)
{
if(n<=1)
return(1);
else
return (n*fact(n-1));
}