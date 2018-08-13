// Stack in C
#include <stdio.h>
#include <stdlib.h>

void push(int[], int size, int item);
int pop(int[], int size);
void display(int[]);
int top = -1;

void main() {
    int top, item, ch = 1, size = 5, a[size];
    while(1) {
        printf("\nEnter your choice:\n");
        printf("1.PUSH 2.POP 3.DISPLAY 4.EXIT\n");
        scanf("%d", &ch);
        switch(ch) {
            case 1: printf("Enter number to be pushed: ");
                    scanf("%d", &item);
                    push(a, size, item);
                    break;
                    
            case 2: printf("\nPopped --> %d", pop(a, size));
                    break;

            case 3: display(a);
                    break;

            case 4: exit(0);
            default: printf("\nWrong entry\n");
        }
    }
}

void push(int a[], int size, int item) {
    if(top == size - 1)
        printf("Stack full. You should pop first");
    else
        a[++top] = item;
}

int pop (int a[], int size) {
    if(top == -1) {
        printf("Stack empty");
        return 0;
    }
    else
        return a[top--];
}

void display(int a[]) {
    printf("\nStack --> ");
    int i;
    for(i=0; i<=top;i++)
        printf("%d ", a[i]);
    if(top == -1)
        printf("Stack is empty");
}
