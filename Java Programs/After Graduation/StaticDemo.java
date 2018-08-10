// Using static in Java: static block, static method and the main method

class UseStatic {
    static int a = 3, b;

    static {
        System.out.println("Inside static block");
        a = 4;
        b = 5;
    }

    static void print() {
        System.out.println("Inside static method");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String args[]) {
        System.out.println("Inside static main method");
        print();
    }
}

class StaticDemo {
    public static void main (String args[]) {
        System.out.println("Inside main method of calling class");
        UseStatic.print();
    }
}
