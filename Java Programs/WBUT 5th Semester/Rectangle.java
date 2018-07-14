class Rectangle
{
    public static void main(String args[])
    {
        int length,breadth;
        length=8;breadth=5;
        Rectangle ob=new Rectangle();
        ob.area(length,breadth);
        ob.perimeter(length,breadth);
    }
    public void area(int l,int b)
    {
        System.out.println("Area = "+(l*b));
    }
    public void perimeter(int l,int b)
    {
        System.out.println("Perimeter = "+(2*(l+b)));
    }
}