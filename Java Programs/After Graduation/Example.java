class Example {
    static int a;
    void myName() {
        System.out.println("Hello!");
        System.out.println(a);
        System.out.printf("My name has %d characters", a);
    }
    Example() {
        a = 9;
    }
}


class ExampleDemo {
    public static void main(String args[]) {
        Example obj = new Example();
        obj.myName();
        
    }
}
