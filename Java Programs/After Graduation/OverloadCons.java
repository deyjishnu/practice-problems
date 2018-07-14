class OverloadCons {
    public static void main(String args[]) {
        Box rectangle, myBox, cube, cube2;
        rectangle = new Box(3, 6, 9);
        rectangle.printVolume();
        
        myBox = new Box();
        myBox.printVolume();

        cube = new Box(3);
        cube.printVolume();

        cube2 = new Box(cube);
        cube2.printVolume();
    }
}