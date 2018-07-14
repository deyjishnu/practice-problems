abstract class Figure
{
    int a,b;
    Figure(int x,int y)
    {
        a=x;
        b=y;
    }
    abstract int area();
}
class Rectangle extends Figure
{
    Rectangle(int length,int breadth)
    {
        super(length,breadth);
    }
    int area()
    {
        int z=a*b;
        return(z);                                                                         
    }
}
class Triangle extends Figure
{
    Triangle(int base,int height)
    {
        super(base,height);
    }
    int area()
    {
        int z=(int)(0.5*b*a);
        return z;
    }
}
class Demo
{
    public static void main(String args[])
    {
        Rectangle ob1=new Rectangle(3,4);
        Triangle ob2=new Triangle(3,4);
        System.out.println("Area of Rectangle is "+ob1.area());
        System.out.println("Area of Triangle is "+ob2.area());
    }
}