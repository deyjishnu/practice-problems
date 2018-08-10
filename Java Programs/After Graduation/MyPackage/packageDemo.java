/* This program is to show how to use packages in Java
This java file should be present in the MyPackage folder
Compile this file by typing this in the terminal when the current folder is "MyPackage": javac packageDemo.java
To run this program, type this in the terminal when the current folder is a parent directory of "MyPackage": java MyPackage.packageDemo */

package MyPackage;
class packageTest {
    int a, b;
    packageTest(int x, int y) {
        a = x;
        b = y;
    }

    int sum() {
        return a + b;
    }

    int difference() {
        return a - b;
    }
}

class packageDemo {
    public static void main(String args[]) {
        packageTest ob = new packageTest(8, 3);
        System.out.println("Sum is " + ob.sum());
        System.out.println("Difference is " + ob.difference());
    }
}
