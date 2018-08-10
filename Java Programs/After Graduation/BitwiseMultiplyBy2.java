/* An efficient way to multiply a number by 2 is to left the number by 1 position.
However, it might lead to a negative number, or a reduced number if a 1 is left shifted and discarded.
Then we should multiply the number normally by 2.
 */

import java.util.Scanner;

class BitwiseMultiplyBy2 {
    public static void main(String args[]) {
        int twice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        if((n << 1) > n)
            twice = n << 1;
        else
            twice = n * 2;

        System.out.println(n + " * 2 = " + twice);
        sc.close();
    }
}
