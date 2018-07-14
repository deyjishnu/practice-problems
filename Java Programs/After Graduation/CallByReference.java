class CallByReference {
    public static void main(String args[]) {
        Test ob = new Test();
        ob.printValues();

        ob = ob.incrByTen();
        ob.printValues();

        ob.calc(ob);
        ob.printValues();
    }
}
