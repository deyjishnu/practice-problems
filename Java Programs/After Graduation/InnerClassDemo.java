// This is a program to demonstrate nested classes

class Outer {
    int outer_x = 100;

    void test() {
        // System.out.println("Inner_x = " + inner_x); //This will give an error because the outer class can't access the inner class members
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        int inner_x = 5;
        void display() {
            System.out.println("Inner_x = " + inner_x);
            // The inner class can access the outer class members
            System.out.println("Outer_x = " + outer_x);
        }
    }
}

class InnerClassDemo {
    public static void main(String args[]) {
        Outer outer = new Outer();
        outer.test();
        // Inner inner = new Inner(); //This will give an error because the inner class is only visible to its outer class
        // inner.display();
    }
}
