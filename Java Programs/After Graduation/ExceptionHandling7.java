/* 'finally' is a block of code that is always run after a try block (irrespective of whether an exception occurs in the try block or not,
or whether there is a catch clause is present or not)
*/

class ExceptionHandling7 {
    public static void main(String args[]) {
        try {
            int a = 5/0;
            System.out.println("a = " + a);
            System.out.println("This will not be printed");
        } catch (Exception e) {
            System.out.println("Exception Caught!");
            System.out.println("After catch statement");
        }
        finally {
            System.out.println("finally block is always executed");
        }
        /* The following line of code cannot execute if there is an unhandled exception,
        in case of which, there is a sudden termination of program after 'finally' block */
        System.out.println("After try/catch blocks");
    }
}
