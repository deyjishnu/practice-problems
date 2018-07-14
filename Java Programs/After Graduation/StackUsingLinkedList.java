class StackUsingLinkedList{
    int data;
    StackUsingLinkedList next;

    StackUsingLinkedList() {
        data = 0;
        next = null;
    }

    StackUsingLinkedList(int item) {
        data = item;
        next = null;
    }
}


class StackULL {
    StackUsingLinkedList top = null;

    boolean stackIsEmpty() {
        return top == null? true : false;
    }

    void push(int item) {
        StackUsingLinkedList newNode = new StackUsingLinkedList(item);
        if(!stackIsEmpty())
        newNode.next = top;
        top = newNode;
    }

    int pop() {
        if(stackIsEmpty()) {
            System.out.println("Stack Underflow!");
            return 0;
        }
        else {
            int item = top.data;
            top = top.next;
            return item;
        }
    }

    int top() {
        return top==null? 0 : top.data;
    }
}
