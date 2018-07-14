class Box {
    double width;
    double height;
    double depth;
    
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        width = height = depth = len;
    }

    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    public double volume() {
        return width * height * depth;
    }

    public void printVolume() {
        System.out.println("Volume is " + width * height * depth);
    }
}