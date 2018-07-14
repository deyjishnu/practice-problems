import java.io.*;
class Box
{
   double length,breadth,height,vol;
   Box()
   {
      length=breadth=height=0;
   }
   Box(double x)
   {
      length=breadth=height=x;
   }
   Box(double x,double y,double z)
   {
      length=x;
      breadth=y;
      height=z;
   }
   void display()
   {
      System.out.println("Volume = "+vol);
   }
   void volume()
   {
      vol=length*breadth*height;
   }
   public static void main(String args[])throws IOException
   {
      double x,y,z;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      Box ob1=new Box();
      ob1.volume();
      ob1.display();
      System.out.println("Enter one side--> ");
      x=Double.parseDouble(br.readLine());
      Box ob2=new Box(x);
      ob2.volume();
      ob2.display();
      System.out.println("Enter three sides--> ");
      x=Double.parseDouble(br.readLine());
      y=Double.parseDouble(br.readLine());
      z=Double.parseDouble(br.readLine());
      Box ob3=new Box(x,y,z);
      ob3.volume();
      ob3.display();
   }
}

/*
Volume = 0.0
Enter one side-->
2
Volume = 8.0
Enter three sides-->
4
3
2
Volume = 24.0
*/