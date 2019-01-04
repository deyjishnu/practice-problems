// Create a a singly linked list with some common operations

#include <stdio.h>
#include <stdlib.h>

typedef struct Node {
    int data;
    struct node *next;
} node;

void append(node **, int);
void addatbeg(node **, int);
void addafter(node *, int, int);
void display(node *);
int count(node *);
void del(node **, int);

void main() {
    node *head;
    head = NULL;

    printf("No. of nodes in linked list = %d", count(head));

    append(&head, 1);
    append(&head, 2);
    append(&head, 3);

    printf("No. of nodes in linked list = %d", count(head));
    display(head);

    addatbeg(&head, 0);
    display(head);

    addafter(head, 4, 30);
    addafter(head, 10, 2);

    printf("No. of nodes in linked list = %d", count(head));
    display(head);

    del(&head, 3);
    del(&head, 1);
    del(&head, 10);
    del(&head, 2);

    printf("No. of nodes in linked list = %d", count(head));
    display(head);
}

void append(node **phead, int data) {
    // Create a  new node
    node *temp = (node *)malloc(sizeof(node));
    temp->data = data;
    temp->next = NULL;

    // Attach the new node
    node *temp2 = *phead; // create a copy of head
    while(temp2 != NULL)
        temp2 = temp2->next;
    temp2 = temp;
}

int count(node *head) {
    int l = 0;
    while(head) {
        head++;
        l++;
    }
    return l;
}

void display(node *head) {
    printf("Linked list -->");
    while(head) {
        printf("%d ", head->data);
    }
    printf("\n");
}
