import java.util.Scanner;

class DNode {
    int data;
    DNode prev;
    DNode next;

    DNode(int d) {
        data = d;
        prev = next = null;
    }

    DNode() {
        data = 0;
        prev = next = null;
    }

    boolean LinkedListIsEmpty(DNode head) {
        return head == null? true : false;
    }

    DNode addNodeAtEnd(DNode head, int data) {
        DNode newNode = new DNode(data);
        if(LinkedListIsEmpty(head))
        head = newNode;
        else {
            DNode p = head;
            while(p.next != null)
            p = p.next;
            p.next = newNode;
            newNode.prev = p;
        }
        return head;
    }

    DNode addNodeAtBeginning(DNode head, int data) {
        DNode newNode = new DNode(data);
        if(LinkedListIsEmpty(head))
        head = newNode;
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        return head;
    }

    DNode removeFirstNode(DNode head) {
        if(LinkedListIsEmpty(head))
        head = null;
        else
        head = head.next;
        return head;
    }

    DNode removeLastNode(DNode head) {
        if(LinkedListIsEmpty(head))
        head = null;
        else {
            DNode p = head;
            while(p.next != null)
            p = p.next;
            p.prev.next = null; 
        }
        return head;
    }

    void display(DNode head) {
        if(LinkedListIsEmpty(head)) {
            System.out.print("No nodes present!");
            return;
        }
        DNode p = head;
        while(p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }

    void displayReverse(DNode head) {
        if(LinkedListIsEmpty(head)) {
            System.out.print("No nodes present!");
            return;
        }
        DNode p = head;
        while(p.next != null)
        p = p.next;
        while(p != head) {
            System.out.print(p.data + " ");
            p = p.prev;
        }
    }
}



class DoublyLinkedList {
    public static void main(String args[]) {
        int data, ch;
        DNode head = null;
        Scanner sc = new Scanner(System.in);
        DNode LinkedList = new DNode();
        System.out.println(".....DOUBLY LINKED LIST.....");
        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add a node at the end");
            System.out.println("2. Add a node at the beginning");
            System.out.println("3. Remove the first node");
            System.out.println("4. Remove the last node");
            System.out.println("5. Display the linked list");
            System.out.println("6. Reverse display the linked list");
            System.out.println("7. Exit");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                System.out.print("Enter data: ");
                data = sc.nextInt();
                head = LinkedList.addNodeAtEnd(head, data);
                break;

                case 2:
                System.out.print("Enter data: ");
                data = sc.nextInt();
                head = LinkedList.addNodeAtBeginning(head, data);
                break;
    
                case 3:
                head = LinkedList.removeFirstNode(head);
                if(!LinkedList.LinkedListIsEmpty(head))
                System.out.println("The first node is removed");
                break;

                case 4:
                head = LinkedList.removeLastNode(head);
                if(!LinkedList.LinkedListIsEmpty(head))
                System.out.println("The last node is removed");
                break;

                case 5:
                System.out.print("Linked List: ");
                LinkedList.display(head);
                System.out.println();
                break;

                case 6:
                System.out.print("Linked List displayed in reverse order: ");
                LinkedList.displayReverse(head);
                System.out.println();
                break;
    
                case 7:
                System.out.println("The program exited");
                System.exit(0);
    
                default:
                System.out.println("Wrong Entry!");
            }
        }
    }
}