// Using throw keyword, we can explicitly throw an exception

class ExceptionHandling5 {
    public static void main(String args[]) {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Exception: " + e);
        }
    }
}
