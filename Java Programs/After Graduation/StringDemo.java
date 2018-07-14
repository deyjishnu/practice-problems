class StringDemo {
    public static void main(String args[]) {
        char str[] = {'J','i','s','h','n','u'};
        myString name = new myString(str);
        System.out.println("Length of string is " + name.length);

        myString name2 = new myString(name);
        name.println();
        name2.println();
        System.out.println("Length of string is " + name2.length);
    }
}