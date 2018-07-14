import java.io.*;
public interface StackMethods
{
   default int a[]=new int[1],size=0,top=-1;
   void push(int x);
   int pop();
}

class FixedStack implements StackMethods
{
   FixedStack(int n)
   {
      size=n;
      a=new int[size];
   }
   public void push(int x)
   {
      if(top==size-1)
      System.out.println("Stack Overflows");
      else
      a[++top]=x;
   }
   public int pop()
   {
      return a[top--];
   }
}
class DynStack implements StackMethods
{
   DynStack(int n)
   {
      size=n;
      a=new int[size];
   }
   public void push(int x)
   {
      if(top==size-1)
      {
         size=size*2;
         int b[]=new int[size];
         for(int i=0;i<=top;i++)
	 b[i]=a[i];
	 a=b;
      }
      a[++top]=x;
   }	
   public int pop()
   {
      return a[top--];
   }
}
class Demo
{
   public static void main(String args[])throws IOException
   {
      int ch,c=0,f;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Press  1 for static/nPress 2 for dyanamic array");
      int y=Integer.parseInt(br.readLine());
      StackMethods ob;
      if(y==1)
      ob=new FixedStack(2);
      else
      ob=new DynStack(2);
      do
      {
         System.out.println("Enter your choice --> 1.Push 2.Pop 3.Display");
         ch=Integer.parseInt(br.readLine());
         switch(ch)
         {
            case 1:System.out.println("Enter the data -->");
                   int x=Integer.parseInt(br.readLine());
                   ob.push(x);
                   break;
            case 2:if(ob.top==-1)
                   System.out.println("Stack Underflows");
                   else
                   {
                      c=ob.pop();
                      System.out.println("Popped element --> "+c);
                   }
                   break;
            case 3:System.out.println("Stack -->");
                   for(int i=ob.top;i>=0;i--)
                   System.out.print(ob.a[i]+" ");
         }
         System.out.println("If you want to continue press 1, else any other integer");
         f=Integer.parseInt(br.readLine());
      }
      while(f==1);
   }
}