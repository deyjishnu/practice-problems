class Cal
{
   public static void main(String args[])
   {
       int z=0;
       int x=Integer.parseInt(args[0]);	
       char ch=args[1].charAt(0);
       int y=Integer.parseInt(args[2]);
       System.out.println("Result -->");
       switch(ch)
       {
           case '+': z=x+y;
                     break;
           case '-': z=x-y;
                     break;
           case 'X': z=x*y;
                     break;
           case '/': z=x/y;
                     break;
           default : System.out.println("Something went wrong !! Try Again");
                     System.exit(0);
        }
        System.out.println(z);
    }
}