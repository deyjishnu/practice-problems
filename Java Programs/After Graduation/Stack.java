// Define a Stack using the ideas of class and encapsulation in Java
class Stack {
    private int a[] = new int[10];
    private int tos;
    
    Stack() {
        tos = -1;
    }

    void push(int item) {
        if(tos >= 9)
        System.out.println("Stack Overflow!");
        else
        a[++tos] = item;
    }

    int pop() {
        if(tos <= -1) {
            System.out.println("Stack Underflow!");
            return 0;
        }
        else
        return a[tos--];
    }
}