import java.io.*;
class AreaOverload
{
    public static void main(String args[])throws IOException
    {
        double r,b,h;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter radius of circle -->");
        r=Double.parseDouble(br.readLine());
        System.out.println("Enter base and height of triangle -->");
        b=Double.parseDouble(br.readLine());
        h=Double.parseDouble(br.readLine());
        AreaOverload ob=new AreaOverload();
        System.out.println("Area of circle --> "+ob.area(r));
        System.out.println("Area of triangle --> "+ob.area(b,h));
   }
   double area(double r)
   {
        return (3.14*r*r);
   }
   double area(double b,double h)
   {
        return (0.5*b*h);
   }
}