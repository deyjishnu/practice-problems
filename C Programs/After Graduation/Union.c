// Union in C and its memory allocation
#include <stdio.h>
#include <string.h>

union Data {
    char a[10];
    int i;
    float j;
};

void main() {
    union Data data1;
    data1.i = 1;
    data1.j = 2;
    strcpy(data1.a, "All is well");
    printf("Sizes %d  %d  %d  %d", sizeof(data1.a), sizeof(data1.i), sizeof(data1.j), sizeof(data1));
    printf("\ndata1.a = %s \ndata1.i = %d \ndata1.j = %d \n", data1.a, data1.i, data1.j);
}
