import java.util.Scanner;

class StackDemo {
    public static void main(String args[]) {
        int ch, item;
        Scanner sc = new Scanner(System.in);
        StackULL aStack = new StackULL();        
        System.out.println("......STACK......");
        while(true) {
            System.out.println("Enter your choice: 1.PUSH   2.POP   3.PEEK   4.EXIT");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                System.out.print("Enter element: ");
                item = sc.nextInt();
                aStack.push(item);
                break;

                case 2:
                System.out.println("Popped: " + aStack.pop());
                break;

                case 3:
                System.out.println("Topmost element: " + aStack.top());
                break;

                case 4:
                sc.close();
                System.exit(0);

                default:
                System.out.println("Wrong entry!");
            }
        }
    }
}