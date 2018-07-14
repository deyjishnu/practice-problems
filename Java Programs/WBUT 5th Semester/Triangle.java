abstract class Triangle
{
    abstract void type_of_triangle();
}
class EquilateralTriangle extends Triangle
{
    void type_of_triangle()
    {
        System.out.println("3 sides are equal");
    }
}
class IsocelesTriangle extends Triangle
{
    void type_of_triangle()
    {
        System.out.println("2 sides are equal");
    }
}
class ScaleneTriangle extends Triangle
{
    void type_of_triangle()
    {
        System.out.println("3 sides are different");
    }
}
class Demo
{
    public static void main(String args[])
    {
        EquilateralTriangle ob1=new EquilateralTriangle();
        IsocelesTriangle ob2=new IsocelesTriangle();
        ScaleneTriangle ob3=new ScaleneTriangle();
        ob1.type_of_triangle();
        ob2.type_of_triangle();
        ob3.type_of_triangle();
    }
}