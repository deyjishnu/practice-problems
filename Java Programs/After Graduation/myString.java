class myString {
    private char str[];
    int length;

    myString(char s[]) {
        str = s;
        length = s.length;
    }

    myString(myString s) {
        str = s.str;
        length = s.str.length;
    }

    void print() {
        System.out.print(str);
    }

    void println() {
        System.out.print(str);
        System.out.print("\n");
    }
}