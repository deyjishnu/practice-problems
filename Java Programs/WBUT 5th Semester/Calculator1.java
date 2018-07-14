class Calculator
{
   public static void main(String args[])
   {
       int x,y;
       x=10;y=2;
       Calculator ob=new Calculator();
       ob.add(x,y);
       ob.subtract(x,y);
       ob.multiply(x,y);
       ob.divide(x,y);
   }
   void add(int x,int y)
   {
       System.out.println("Sum = "+(x+y));
   }
   void subtract(int x,int y)
   {
       System.out.println("Difference = "+(x-y));
   }
   void multiply(int x,int y)
   {
       System.out.println("Product = "+(x*y));
   }
   void divide(int x,int y)
   {
       System.out.println("Quotient = "+(x/y));
   }
}