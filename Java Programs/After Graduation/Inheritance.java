class Superclass {
    int increment(int i) {
        return ++i;
    }
}

class Subclass extends Superclass{
    int increment(int i) {
        return super.increment(i) + 1;
    }
}

class InheritanceDemo {
    public static void main(String args[]) {
        Subclass obj = new Subclass();
        System.out.print(obj.increment(1));
    }
}