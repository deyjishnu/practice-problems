import java.io.*;
class pass_by_value
{
    public void accept(int x,int y)
    {
     x=x+10;
     y=y+10;
     System.out.println("x = "+x+" and y = "+y);
    }
    public static void main(String args[])throws IOException
    {
        int a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first value -->");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter the first value -->");
        b=Integer.parseInt(br.readLine());
        pass_by_value obj=new pass_by_value();
        obj.accept(a,b);
        System.out.println("a = "+a+" and b = "+b);
    }
}