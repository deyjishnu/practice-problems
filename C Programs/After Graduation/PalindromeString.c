#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void main() {
    char string[50];
    printf("Enter a string: ");
    scanf("%s", &string);

    int length = strlen(string);
    for(int i=0; i<length/2; i++) {
        if(!(string[i] == string[length - 1 - i])) {
            printf("Not palindrome\n");
            exit(0);
        }
    }

    printf("Palindrome\n");
}