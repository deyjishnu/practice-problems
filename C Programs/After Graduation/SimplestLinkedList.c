// Create a singly linked list of two nodes in C without using dynamic memory allocation(malloc/calloc), ie. the simplest linked list possible
#include <stdio.h>

typedef struct node {
    int data;
    struct node* next;
} Node;

void main() {
    Node *head, *tempPointer;
    Node firstNode, secondNode;
    head = &firstNode;

    firstNode.data = 1;
    firstNode.next = &secondNode;

    secondNode.data = 2;
    secondNode.next = NULL;

    printf("Nodes: \n");
    tempPointer = head;
    while(tempPointer != NULL) {
        printf("%d ", tempPointer->data);
        tempPointer = tempPointer->next;
    }
}
