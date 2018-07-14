import java.io.*;
class pass_by_reference
{
    int x,y;
    //pass_by_reference obj=new pass_by_reference();
    public void accept(pass_by_reference obj3)
    {
     obj3.x=obj3.x+10;
     obj3.y=obj3.y+10;
     System.out.println("CHANGED VALUES");
     System.out.println("x = "+obj3.x+" and y = "+obj3.y);
    }
    public static void main(String args[])throws IOException
    {
        int a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first value -->");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the second value -->");
        b=Integer.parseInt(br.readLine());
        pass_by_reference obj1=new pass_by_reference();
        pass_by_reference obj2=new pass_by_reference();
        obj1.x=a;
        obj1.y=b;
        obj2.accept(obj1);
        System.out.println("ORIGINAL VALUES");
        System.out.println("x = "+obj1.x+" and y = "+obj1.y);
    }
}