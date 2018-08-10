// Using an interface, we can fully abstract a class' interface from its implementation

interface Figure {
    double area();
}

class Rectangle implements Figure {
    double dim1, dim2;

    Rectangle(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    
    public double area() { // The implemented methods must be public
        return dim1 * dim2;
    }
}

class TestInterface {
    public static void main(String args[]) {
        // Figure ob = new Figure(); // Illegal as Figure is an interface
        // Figure ob = new Rectangle(5, 3); // Legal, as a reference variable of an interface can refer to an oject of a class that implements it
        
        Rectangle r = new Rectangle(5, 3);
        System.out.println("Area is " + r.area());
    }
}
