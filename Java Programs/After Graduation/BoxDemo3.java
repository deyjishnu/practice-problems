class BoxDemo3 {
    public static void main(String args[]) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

        System.out.println("Volume of myBox1 is " + myBox1.volume());
        System.out.println("Volume of myBox2 is " + myBox2.volume());
    }
}