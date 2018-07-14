//MENU DRIVEN PROGRAM TO PUSH ,POP AND DISPLAY IN A STACK
import java.io.*;
class Stack
{
   int n;
   int p=-1;
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public void create()throws IOException
   {
      int k;
      System.out.println("Enter the size of the stack -->");
      n=Integer.parseInt(br.readLine());
      int a[]=new int[n];
      System.out.println(".....MENU.....");
      System.out.println("1....PUSH.....");
      System.out.println("2....POP......");
      System.out.println("3...DISPLAY...");
      System.out.println("4....EXIT.....");
      do
      {
         System.out.println("Enter your choice -->");
         k=Integer.parseInt(br.readLine());
         if(k==1)
         push(a,n);
         else if(k==2)
         pop(a);
         else if(k==3)
         display(a);
         else if(k==4)
         System.exit(0);
         else
         System.out.println("Wrong choice !! Try again");
      }
      while(k!=4);
   }
   public void push(int a[],int n)throws IOException
   {
      int x;
      p++;
      if(p==n)
      System.out.println("Stack Overflow !!");
      else
      {
         System.out.println("Enter the value -->");
         x=Integer.parseInt(br.readLine());
         a[p]=x;
         return;
      }
   }
   public void pop(int a[])
   {
      if(p==-1)
      System.out.println("Stack Underflow !!");
      else
      {
         System.out.println("value to be deleted -->"+a[p]);
         p--;
         return;
      }
   }
   public void display(int a[])
   {
      int i;
      System.out.println("Values in Stack -->");
      for(i=0;i<=p;i++)
      System.out.print(a[i]+"  ");
      System.out.println();
      return;
   }
}