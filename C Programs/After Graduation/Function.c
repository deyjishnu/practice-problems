// A simple C program to demonstrate function calls
#include <stdio.h>

int add(int, int);
int multiply(int, int);
int subtract(int, int);
int divide(int, int);

void main() {
    int a, b;
    printf("Enter two numbers: ");
    scanf("%d %d", &a, &b);
    printf("Sum = %d", add(a, b));
    printf("\nProduct = %d", multiply(a, b));
    printf("\nDifference = %d", subtract(a, b));
    printf("Quotient = %d", divide(a,b));
}

int add(int a, int b) {
    return a + b;
}

int multiply(int a, int b) {
    return a * b;
}

int subtract(int a, int b) {
    return a - b;
}

int divide(int a, int b) {
    if(b != 0)
    return a / b;
    else
    printf("\nIndeterminate! ");
    return 0;
}
