// Show what a string really is in C
#include <stdio.h>
#include <string.h>

void printString(char*);

void main() {

    // CHARACTER ARRAYS IN C ARE CALLED STRINGS
    char s[10] = "Jishnu";
    printf("Size of s is %d\n", sizeof(s));
    // char s[] = "Jishnu"; // You can also create a string without specifying its length

    // A CHARACTER ARRAY CONTAINS A NULL CHARACTER AT THE END
    int i;
    for(i = 0; i < 10, s[i] != '\0'; i++);
    printf("No. of characters in s = %d\n", i + 1); // Value printed will be one more than the number of characters stored in s
                                                    // because at the end, there is an additional null character "\0"
    puts(s); // Prints the string until null termination
    printf("%s", s); // Another way to print string

    // COPYING CHARACTER ARRAYS
    char s2[10];
    // s2 = s; // This statement will give an error, because s2 is a constant pointer to the base address of an array
    // s2 = "Jishnu"; // This statement will give an error, because s2 is a constant pointer to the base address of an array
    strcpy(s2, s); // Best way to copy one character array to another. This function is found in string.h header file
    s2[0] = 'V'; // This works because we can always change values of individual elements in an array
    puts(s2); // This function and all other functions which takes a character array prints values of the array until null termination

    // CHARACTER POINTER
    char* s3;
    s3 = s; // This works because s3 is a pointer variable, and not a constant. But this is not copying; s3 and s points to the same array
    puts(s3); // This works because puts() (and all other functions which takes a character array, 
              // even user-defined functions: see printString() method here) expects a character pointer.
              // Its declaration is: int puts(const char *str)
    *s3 = 'V'; // This changes the value of the first character by dereferencing s3;
    puts(s3);
    // To access elements...
    putchar(s[3]);
    printf("\n");
    putchar(*(s + 3));

    // PASSING CHARACTER ARRAYS/POINTERS TO FUNCTIONS
    printString(s);
    printString(s2);
    printString(s3);
}

void printString(char* c) { //We can also write: void printString(char c[]) {....}
    printf("\n");
    puts(c);
}
