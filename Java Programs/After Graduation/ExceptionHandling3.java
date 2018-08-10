/* Multiple catch clauses */

class ExceptionHandling3 {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42/a;
            System.out.println("b = " + b);
            int c[] = {1};
            c[42] = 5;
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e);
        }
        System.out.println("After try/catch blocks");
    }
}
