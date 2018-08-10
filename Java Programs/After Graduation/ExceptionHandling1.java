// A simple program to illustrate exception handling in Java

class ExceptionHandling1 {
    public static void main(String args[]) {
        try {
            int a = 5/0;
            System.out.println("a = " + a);
            System.out.println("This will not be printed");
        } catch (Exception e) {
            System.out.println("Exception Caught!");
            System.out.println("After catch statement");
        }
        System.out.println("After try/catch blocks");
    }
}
