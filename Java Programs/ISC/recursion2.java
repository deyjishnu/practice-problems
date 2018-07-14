class recursion2
{
   public int fib(int n)
   {
      System.out.print("called fib("+n+")->");
      if(n==1)
      {
      System.out.print("1stBaseCase ");
      System.out.println();
      return 0;
      }
      else if(n==2)
      {
      System.out.print("2ndBaseCase ");
      System.out.println();
      return 1;
      }
      else if(n>2)
      {
      System.out.print("RecurCase ");
      return fib(n-1)+fib(n-2);
      }
      else
      {
      System.out.print("3rdBaseCase ");
      return -1;
      }
   }
   public static void main(int x)
   {
      int i,term;
      recursion2 obj=new recursion2();
      for(i=1;i<=x;i++)
      {
          term=obj.fib(i);
          System.out.println("term="+term);
      }
   }
}