import java.util.*;

class Node {
    private int data;
    private Node next;

    Node() {
        data = 0;
        next = null;
    }
    
    Node(int d) {
        data = d;
        next = null;
    }

    // Insert a node at nth position
    Node addNode(Node head, int n, int data) {
        Node temp = new Node(data);
        if (LinkedListIsEmpty(head))
        head = temp;
        else if(numberOfNodes(head) == 1) {
            if(n == 1) {
                temp.next = head;
                head = temp;
            }
        }
        else {
            Node p = getNthNode(head, n - 1);
            temp.next = p.next;
            p.next = temp;
        }
        return head;
    }

    // Add a node at the end
    Node addNode(Node head, int data) {
        Node temp = new Node(data);
        if (LinkedListIsEmpty(head))
            head = temp;
        else {
            Node p = getTail(head);
            p.next = temp;
        }
        return head;
    }

    // Return true if the linked list is empty; else false
    boolean LinkedListIsEmpty(Node head) {
        return (head == null)? true : false;
    }

    // Return the total number of nodes
    int numberOfNodes(Node head) {
        if(LinkedListIsEmpty(head))
        return 0;
        Node p = head;
        int count = 1;
        while(p.next != null) {
            p = p.next;
            count++;
        }
        return count;
    }

    // Remove nth node
    Node removeNode(Node head, int n) {
       
        
        Node p = getNthNode(head, n - 1);
        if(p != null)
        p.next = null;
        return head;
    }

    // Remove last node
    Node removeNode(Node head) {
        if(numberOfNodes(head) == 1)
        head = null;
        Node p = getNthNode(head, numberOfNodes(head)- 1);
        if(p != null)
        p.next = null;
        return head;
    }

    // Return the nth node
    Node getNthNode(Node head, int n) {
        if(numberOfNodes(head) < n || n < 0)
        return null;
        else if(n == 0)
        return head;
        Node p = head;
        int i = 1;
        while(p.next != null && i!=n) {
            p = p.next;
            i++;
        }    
        return p;
    }

    // Return the last node
    Node getTail(Node head) {
        if(LinkedListIsEmpty(head))
        return null;
        Node p = head;
        while(p.next != null)
        p = p.next;
        return p;
    }
    
    // Print the linked list
    void display(Node head) {
        if(LinkedListIsEmpty(head)) {
            System.out.print("No nodes present!");
            return;
        }
        Node p = head;
        while(p != null) {
            System.out.print(p.data + " ");
            p = p.next;
        }
    }
}

class SinglyLinkedList{
    public static void main(String args[]) {
        int data, ch;
        Node head = null;
        Scanner sc = new Scanner(System.in);
        Node LinkedList = new Node();
        System.out.println(".....SINGLY LINKED LIST.....");
        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Add a node");
            System.out.println("2. Insert a node at nth position");
            System.out.println("3. Remove the last node");
            System.out.println("4. Remove the node at nth position");
            System.out.println("5. Print the total number of nodes");
            System.out.println("6. Reverse the linked list");
            System.out.println("7. Display the linked list");
            System.out.println("8. Exit");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                System.out.print("Enter data: ");
                data = sc.nextInt();
                head = LinkedList.addNode(head, data);
                break;

                case 2:
                System.out.print("Enter the position: ");
                int n = sc.nextInt();
                if(n > LinkedList.numberOfNodes(head) + 1 || n < 0) {
                    System.out.println("Not possible!");
                    continue;
                }
                System.out.print("Enter data: ");
                data = sc.nextInt();
                head = LinkedList.addNode(head, n, data);
                break;
    
                case 3:
                head = LinkedList.removeNode(head);
                if(!LinkedList.LinkedListIsEmpty(head))
                System.out.println("The last node is removed"); 
                break;

                case 4:
                System.out.print("Enter the position: ");
                n = sc.nextInt();
                if(n > LinkedList.numberOfNodes(head) || n < 0) {
                    System.out.println("No such positions!");
                    continue;
                }
                head = LinkedList.removeNode(head, n);
                if(!LinkedList.LinkedListIsEmpty(head))
                System.out.println("The " + n + "th node is removed");
                break;

                case 5:
                System.out.print("The total number of nodes: " + LinkedList.numberOfNodes(head));
                break;

                case 6:

                case 7:
                System.out.print("Linked List: ");
                LinkedList.display(head);
                System.out.println();
                break;
    
                case 8:
                System.out.println("The program exited");
                sc.close();
                System.exit(0);
    
                default:
                System.out.println("Wrong Entry!");
            }
        }
    }
}
