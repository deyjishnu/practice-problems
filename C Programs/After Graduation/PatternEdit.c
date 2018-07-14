#include <stdio.h>
#include <stdlib.h>

void pattern(int);
void main() {
    int row;
    printf("Enter no of rows: ");
    scanf("%d", &row);
    pattern(row);
    system("PAUSE");
}

// YOUR PREVIOUS CODE
/* void pattern(int row) {
    int i, j;
    for(i = 0; i < row; i++) {
        if(i % 2 == 0) {
            for(i = 1; i <= row; i++) { // Don't use the same variable for two nested loops - becomes complex. So here it's much better to use some variable other than 'i'
                printf("%d", i+1);
                for(j = 1; j <= row; j++) {
                    printf("%d", i);
                }
                printf("\n");
            }
        }
        else {
            // printf("In else\n"); If you print this line, you will see this else block is never executed. So the entire pattern was printed just by the if block.
            for(i = 1; i <= row; i++) {
                for(j = 1; j <= row; j++) {
                    printf("%d", i);
                }
                printf("%d", i+1);
                printf("\n");
            }
        }
    } */

// CORRECT CODE
void pattern(int row) {
    int i, j;
    for(i = 0; i < row; i++) {
        if(i % 2 == 0) {
            for(j = 1; j <= row; j++)
            printf("%d", i+1);
            printf("%d", i+2);
        }
        else {
            printf("%d", i+2);
            for(j = 1; j <= row; j++)
            printf("%d", i+1);
        }
        printf("\n");
    }
}
