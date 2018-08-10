/* A simple program to illustrate exception handling in Java: the goal of most well-constructed catch clause should be
to resolve the exceptional condition and then continue on as if the error had never happened */

class ExceptionHandling2 {
    public static void main(String args[]) {
        try {
            int a = 5/0;
            System.out.println("a = " + a);
        } catch (ArithmeticException e) {
            // You can display a description of the exception by passing the exception object as an argument to println()
            System.out.println("Exception: " + e);
            System.out.println("a is infinite");
        }
    }
}
