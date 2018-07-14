
#include <stdio.h>
#include <conio.h>
main()
{
	int a=10,b;  //an integer variable
	int *p;      //pointer variable which points to an integer variable
	p=&a;        //storing the address of integer variable 'a' to the pointer 'p'
	b=*p;        //storing the value at address stored by pointer 'p' into integer variable 'b'
	printf("Address of variable a is %u and value is %d\n",&a,a);
	printf("Pointer p points to address %u\n",p);
	printf("Value of b is %d",b);
}
