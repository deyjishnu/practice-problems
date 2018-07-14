#include<stdio.h>
#include<conio.h>
int fib(int);
void main()
{
clrscr();
int i,num,b;
printf(" enter the number for fibonacci series \n");
scanf("%d",&num);
printf("the fibonacci series is :");
for(i=0;i<num;i++)
printf("%d  ",fib(i));
b=fib(num-1);
printf("\n the last number of fibonacci series is %d",b);
getch();
}
int fib(int n)
{
if(n==0)
{return(0);}
if(n==1)
return(1);
else
return fib(n-1)+fib(n-2);
}
