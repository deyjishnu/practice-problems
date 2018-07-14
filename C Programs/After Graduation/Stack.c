#include <stdio.h>

void push(int[], int item);
int pop(int[]);

void main() {
    int top, item, ch = 1, a[5];
    do {
        printf("Enter your choice:\n");
        printf("1.PUSH 2.POP 3.DISPLAY 4.EXIT\n");
        scanf("%d", &ch);
        switch {
            case 1: printf("Enter number to be pushed: ");
                    scanf("%d", &item);
                    push(a, item);
                    break;
                    
            case 2: 
        }
    }
    while(ch != 0);
}