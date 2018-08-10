// Abstract class is a class which has some abstract methods (ie. not implemented (only the signature of method is specified)) in it

abstract class Figure {
    double dim1, dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle extends Figure{
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure{
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

class AbstractClass {
    public static void main(String args[]) {
        // Figure f = new Figure(10, 5); // Illegal as Figure is an abstract class
        Figure f = new Rectangle(10, 5); // This is legal as we can refer to a subclass object using a superclass variable
        System.out.println("Area of the rectangle is " + f.area());

        Rectangle r = new Rectangle(5, 3);
        Triangle t = new Triangle(6, 4);
        System.out.println("Area of the rectangle is " + r.area());
        System.out.println("Are of the triangle is " + t.area());
    }
}
