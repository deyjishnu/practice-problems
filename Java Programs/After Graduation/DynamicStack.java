// Define a Character-type Dynamic stack (a stack which never gets full)

class DynamicStack {
    private int tos;
    private int size;
    private char a[];

    // Constructor to set size of stack to 10 by default
    DynamicStack() {
        tos = -1;
        size = 10;
        a = new char[size];
    }

    // Constructor to set custom size of stack
    DynamicStack(int s) {
        tos = -1;
        size = s;
        a = new char[size];
    }

    // Return true if stack is full; else false
    boolean isFull() {
        return (tos >= size - 1)? true : false;
    }

    // Return true if stack is empty; else false
    boolean isEmpty() {
        return (tos == -1)? true : false;
    }

    // Return the topmost element
    char topElement() {
        if (tos == -1)
        return ' ';
        return a[tos];
    }

    // Change the size of stack
    void changeSize(int newSize) {
        if(newSize < size) {
            System.out.println("This size is not possible!");
            return;
        }
        else if(newSize == size) {
            System.out.println("No changes made to the stack because the new size is same as the old size");
            return;
        }
        char b[] = new char[newSize];
        for (int i:b)
        b[i] = a[i];
        a = b;
    }

    // Push elements to stack
    void push(char item) {
        if(isFull())
        changeSize(size * 2);
        a[++tos] = item;  
    }

    // Pop elements from stack
    char pop() {
        if(isEmpty()) {
            System.out.println("Stack Underflow!");
            return ' ';
        }
        else
        return a[tos--];
    }
}
