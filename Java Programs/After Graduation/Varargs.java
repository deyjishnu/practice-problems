/* Varargs, short for variable-lengh arguments: simplifies the creation of methods that need to take a variable length of arguments
It is written as: returntype methodname(int ... arrayname) {body}
which is just an alternative way of writing: returntype methodname(int arrayname[]) {body}
Advantage of using varargs: Multiple values can be passed to the method from the calling method in a comma-separated way
like: methodname(parameter1, parameter2, parameter3); */

class Varargs {
    //VaTest uses a varargs
    static void vaTest(int ... v) {
        System.out.print("Number of args: " + v.length + " Contents: ");
        for(int i : v)
            System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String args[]) {
        // Notice how vaTest() can be called with a variable number of arguments
        vaTest(10);
        vaTest(1, 2, 3);
        vaTest();
    }
}
