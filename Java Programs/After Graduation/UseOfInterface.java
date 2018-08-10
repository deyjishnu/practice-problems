/* A stack is a data-structure where we can push and pop elements from the top.
So, the interface of a stack contains a push() and pop() methods
But it can be implemented in multiple ways like an array, linked list, binary tree, etc.
or a stack of fixed size or dynamic size (grows in size when required) */

// An interface for a stack that can store integers
interface IntStack {
    void push(int item); // store an item

    int pop(); // retrieve an item

    /* Default method is a new addition to interface in Java, in JDK 8. Using this, you can add implementation details of a method.
    But the main purpose of a default method is to add any new method to an existing interface which has already been implemented
    by other classes, without breaking those classes. The existing classes don't need to implement the default method. */
    default void whatIsThis() {
        System.out.println("This is a stack");
    }
}

// An implementation of IntStack that uses fixed storage
class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int [size];
        tos = -1;
    }

    public void push(int item) {
        if(tos == stck.length - 1)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if(tos < 0) {
            System.out.println("Stack is empty.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

// An implementation of IntStack that is growable (size is doubled when the stack becomes full)
class DynStack implements IntStack{
    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int [size];
        tos = -1;
    }

    public void push(int item) {
        if(tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; //create an array of double size
            for(int i=0; i<=tos; i++)
                temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    public int pop() {
        if(tos < 0) {
            System.out.println("Stack is empty.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

// Create an interface variable and access stacks through it
class UseOfInterface {
    public static void main(String args[]) {
        IntStack myStack;
        FixedStack fs = new FixedStack(5);
        DynStack ds = new DynStack(8);

        myStack = fs;
        // Push some elements onto the fixed stack
        for(int i=0; i<12; i++)
            myStack.push(i);

        myStack = ds;
        // Push some elements onto the dynamic stack
        for(int i=0; i<12; i++)
            myStack.push(i);
        System.out.println();

        myStack = fs;
        // Pop the elements from the fixed stack
        System.out.println("Values in the fixed stack:");
        for(int i=0; i<8; i++)
            System.out.print(myStack.pop() + " ");
        System.out.println();

        myStack = ds;
        // Pop the elements from the dynamic stack
        System.out.println("Values in the dynamic stack:");
        for(int i=0; i<8; i++)
            System.out.print(myStack.pop() + " ");
    }
}
