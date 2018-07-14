class Fibo
{
    public static void main(String args[])
    {
        int n=Integer.parseInt(args[0]);
        Fibo obj=new Fibo();
        obj.fibonacci(n);
    }
    public void fibonacci(int n)
    {
        int x=0;int y=1;
        int i,sum;
        System.out.println("Fibonacci Series -->");
        System.out.print(x+" "+y);
        for(i=3;i<=n;i++)
        {
            sum=x+y;
            System.out.print(" "+sum);
            x=y;
            y=sum;
        }
    }
}