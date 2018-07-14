class A
{
    int x=10;
    void show()
    {
        System.out.println("The value of x->"+x);
    }
}
class B extends A
{
    int x=20;
    void show()
    {
        System.out.println("The value of x in B->"+x);
        System.out.println("The value of x->"+super.x);
    }
}
class Demo
{
    public static void main(String args[])
    {
        A ob=new A();
        ob.show();
        B ob1=new B();
        ob1.show();
    }
}