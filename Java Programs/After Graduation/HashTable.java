// Hash table with linear probing
class HashTable1 {
    int hashTable[];
    int hashTableSize;

    HashTable1(int size) {
        hashTableSize = size;
        hashTable = new int[hashTableSize];
    }

    int hashFunction(int a) {
        return a % hashTableSize;
    }

    void insert(int a) {
        int hash = hashFunction(a);
        // Search for an unused slot and if the index exceeds the hashTableSize, then roll back (Linear Probing)
        while(hashTable[hash] != 0)
        hash = (hash + 1) % hashTableSize;
        hashTable[hash] = a;
    }

    boolean search(int a) {
        int hash = hashFunction(a);
        while(hashTable[hash] != a || hashTable[hash] != 0)
        hash = (hash + 1) % hashTableSize;
        if(hashTable[hash] == a)
        return true;
        else
        return false;
    }
}


// Hash table with chaining. Uses class 'Node'
class HashTable2 {
    Node hashTable[];
    int hashTableSize;

    HashTable2(int size) {
        hashTableSize = size;
        hashTable = new int[hashTableSize];
    }
   
    int hashFunction(int a) {
        return a % hashTableSize;
    }

    void insert(int a) {
        int hash = hashFunction(a);
        hashTable[hash] = hashTable[hash].insert(hashTable[hash], a);
    }

    boolean search(int a) {
        int hash = hashFunction(a);
        return hashTable[hash].search(hashTable[hash], a);
    }
}

// Singly Linked List
class Node {
    int data;
    Node next;

    Node() {
        data = 0;
        next = null;
    }

    Node(int d) {
        data = d;
        next = null;
    }

    Node insert(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    boolean search(Node head, int data) {
        while(head != null) {
            if(head.data == data)
            return true;
            head = head.next;
        }
        return false;
    }
}


// Hash table Demo
class HashTableDemo {
    public static void main(String args[]) {
        
    }
}
