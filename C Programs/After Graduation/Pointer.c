// Pointer in C
#include <stdio.h>
void main() {
    int a = 5;
    int *p = &a;
    printf("Address of a is %d \nValue of pointer pointing to a is %d \nAddress of the pointer pointing to a %d", &a, p, &p);
}
