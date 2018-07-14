// Structure in C
#include <stdio.h>
#include <string.h>

struct student {
    char name[20];
    int roll;
};

void main() {
    struct student jishnu;
    strcpy(jishnu.name, "Jishnu Dey");
    jishnu.roll = 17;
    printf("Name: %s   Roll No.: %d", jishnu.name, jishnu.roll);
}
