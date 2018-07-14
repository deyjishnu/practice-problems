#include <stdio.h>
#include <string.h>
void main() {
    char s[] = "Jishnu";

    printf("Reverse String: ");
    for(int i=strlen(s) - 1; i>=0; i--)
    printf("%c",s[i]);
}