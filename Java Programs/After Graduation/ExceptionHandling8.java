// Create your own Exception Subclass

// This is the subclass created to extend the Exception class of the Java standard library
class MyException extends Exception {
    private int detail;

    MyException(int a) {
        detail = a;
    }

    // Override 'toString' method of the Throwable class which is a superclass of Exception class - to show a custom output message
    public String toString () {
        return "My Exception [" + detail + "]";
    }
}

// This is to show the use of the created subclass of the Extension class
class ExceptionHandling8 {
    public static void main(String args[]) {
        try {
            int a = 5;
            if(a > 1)
                // Creating a new object of the MyException class and explicitly throwing it
                throw new MyException(a);
        } catch (MyException e) {
            // The exception is caught and the toString method of MyException class will be used by println instead of
            // the default toString method of the Throwable class
            System.out.println("Caught " + e);
        }
    }
}
