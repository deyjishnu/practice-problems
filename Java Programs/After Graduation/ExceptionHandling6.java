/* throws is a keyword in Java which is used in the signature of method to indicate that this method
might throw one of the listed type exceptions.
The caller to these methods has to handle the exception using a try-catch block
 */

class ExceptionHandling6 {
    static void expMethod() throws IllegalAccessException { // Try removing "throws IllegalAccessException", and you will get an error
		throw new IllegalAccessException("demo");
	}

    public static void main(String args[]) {
        try {
            expMethod();
        } catch (IllegalAccessException e) {
            System.out.println("Exception: " + e);
        }
    }
}
