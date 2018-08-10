// This is a demostration of inheritance in Java

class Superclass {
    int a;

    Superclass(int i) {
        a = i;
    }

    int increment() {
        return ++a;
    }
}

class Subclass extends Superclass{

    Subclass(int i) {
        // The superclass constructor is called using the keyword 'super'
        super(i);
    }

    int decrement() {
        return --a;
    }

    // You can override a method by using the same signature of the method in the subclass
    /* int increment() {
        return a + 2;
    } */
}

class InheritanceDemo {
    public static void main(String args[]) {
        Subclass ob = new Subclass(3);
        // The subclass can access the superclass members
        System.out.println(ob.increment());
        System.out.println(ob.decrement()); 
        
        // The superclass can be used independently of the subclass
        Superclass ob2 = new Superclass(10);
        System.out.println(ob2.increment());
    }
}
