// Create a string and without using the buit-in strlen() function, calculate the number of characters in the string

#include <stdio.h>

int getLength(char *);

void main() {
    char s[] = "Jishnu";
    int len = getLength(s);
    printf("Length of String '%s' is %d", s, len);
}

int getLength(char *s) {
    int len = 0;

    // Any expression that evaluates to zero when changed to int, will result in a false condition. thus terminating a loop
    // As a NULL value is essentially address zero, it will result in false if used as a condition
    while(*s) {
        len++;
        s++;
    }
    return len;
}
