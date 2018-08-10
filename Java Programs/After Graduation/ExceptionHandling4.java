/* Nested try blocks */

class ExceptionHandling4 {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            System.out.println("b = " + b);
            try {
                int c[] = {1};
                c[42] = 5;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index out of bounds: " + e);
            } 
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero: " + e);
        }
        System.out.println("After try/catch blocks");
    }
}
