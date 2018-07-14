// Reverse a string using a stack

import java.util.Scanner;

class ReverseStringUsingStack {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String string;
        System.out.print("Enter a string: ");
        string = sc.next();
        char ch;

        // Create an object of the DynamicStack class to use its methods
        DynamicStack dStack = new DynamicStack(string.length());

        // Push all the characters of the string to the stack
        for(int i = 0; i < string.length(); i++) {
            ch = string.charAt(i);
            dStack.push(ch);
        }

        System.out.print("\nReversed String: ");

        // Pop the characters from the stack, thus getting the string in reverse order
        for(int i = 0; i < string.length(); i++)
        System.out.print(dStack.pop());

        // Close the scanner object
        sc.close();
    }
}
