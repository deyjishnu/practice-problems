import java.util.Scanner;

class BSTNode {
    int data;
    BSTNode left, right;

    BSTNode() {
        left = right = null;
    }

    BSTNode(int d) {
        data = d;
        left = right = null;
    }

    boolean isEmpty(BSTNode root) {
        return root == null? true : false;
    }

    BSTNode insert(BSTNode root, int data) {
        if(isEmpty(root))
        root = new BSTNode(data);
        else if(data <= root.data)
        root.left = insert(root.left, data);
        else
        root.right = insert(root.right, data);
        return root;
    }

    boolean search(BSTNode root, int data) {
        if(isEmpty(root))
        return false;
        else if(data == root.data)
        return true;
        else if(data < root.data)
        return search(root.left, data);
        else
        return search(root.right, data);
    }

    int findMin(BSTNode root) {
        if(isEmpty(root)) {
            System.out.println("Error! Empty Tree!");
            return -1;
        }
        while(root.left != null)
        root = root.left;
        return root.data;
    }

    int findMax(BSTNode root) {
        if(isEmpty(root)) {
            System.out.println("Error! Empty Tree!");
            return -1;
        }
        while(root.right != null)
        root = root.right;
        return root.data;
    }

    int findHeight(BSTNode root) {
        if(isEmpty(root))
        return -1;
        return Math.max(findHeight(root.left), findHeight(root.right)) + 1;
    }

    String inorder(BSTNode root) {
        if(isEmpty(root))
        return "";
        return inorder(root.left) + " " + root.data + " " + inorder(root.right);
    }

    String preorder(BSTNode root) {
        if(isEmpty(root))
        return "";
        return root.data + " " + inorder(root.left) + " " + inorder(root.right);
    }

    String postorder(BSTNode root) {
        if(isEmpty(root))
        return "";
        return inorder(root.left) + " " + inorder(root.right) + " " + root.data;
    }
}

class BinarySearchTree {
    public static void main(String args[]) {
        int data, ch;
        BSTNode root = null;
        Scanner sc = new Scanner(System.in);
        BSTNode BST = new BSTNode();
        System.out.println(".....BINARY SEARCH TREE.....");
        while (true) {
            System.out.println("\nEnter your choice:");
            System.out.println("1. Insert a number");
            System.out.println("2. Search a number");
            System.out.println("3. Find the minimum number");
            System.out.println("4. Find the maximum number");
            System.out.println("5. Find the height of tree");
            System.out.println("6. Inorder Traversal");
            System.out.println("7. Preorder Traversal");
            System.out.println("8. Postorder Traversal");
            System.out.println("9. Exit");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                System.out.print("Enter number: ");
                data = sc.nextInt();
                root = BST.insert(root, data);
                break;

                case 2:
                System.out.print("Enter number: ");
                data = sc.nextInt();
                boolean found = BST.search(root, data);
                if(found)
                System.out.println("Found");
                else
                System.out.println("Not Found");
                break;

                case 3:
                System.out.println("Minimum: " + BST.findMin(root));
                break;

                case 4:
                System.out.println("Maximum: " + BST.findMax(root));
                break;

                case 5:
                System.out.println("Height of tree: " + BST.findHeight(root));
                break;

                case 6:
                System.out.println("Inorder Traversal: " + BST.inorder(root));
                break;

                case 7:
                System.out.println("Preorder Traversal: " + BST.preorder(root));
                break;

                case 8:
                System.out.println("Postorder Traversal: " + BST.postorder(root));
                break;

                case 9:
                System.out.println("The program exited");
                sc.close();
                System.exit(0);
    
                default:
                System.out.println("Wrong Entry!");
            }
        }
    }
}
