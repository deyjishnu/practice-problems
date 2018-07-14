class Test {
    int a, b;

    Test() {
        a = 5;
        b = 8;
    }

    void calc(Test ob) {
        a = a * 2;
        b = b * 2;
    }

    Test incrByTen() {
        Test ob = new Test();
        ob.a = a + 10;
        ob.b = b + 10;
        return ob;
    }

    void printValues() {
         System.out.println("a = " + a + " b = " + b);
    }
}
