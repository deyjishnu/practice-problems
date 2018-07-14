import java.io.*;
import java.util.*;

class Person
{
       int id;
      String city,name;
      int pin;
      Person(int i,String c,String n,int p)
       {
         id=i;
         city=c;
         name=n;
         pin=p;
       }
}
class AddressBook
  {
        Scanner sc=new Scanner(System.in);
        int size;static int i=0;
        Person[] a;
       AddressBook(int s)
        {
           size=s;
           a=new Person[size];
        }
      void insert()
       {
   
          System.out.print("enter id: ");
          int id=sc.nextInt();
  
          System.out.print("enter city: ");
          String  city=sc.nextLine();
          sc.nextLine();
          System.out.print("enter name: ");
          String name=sc.nextLine();
          System.out.print("enter pin: ");
          int pin=sc.nextInt();
          a[i++]=new Person(id,city,name,pin);
        }

            void delete()
               {
                   int pos=0;
                   System.out.print("enter id of the person whose detail is to be deleted: ");
                   int d=sc.nextInt();
                   for(int j=0;j<size;j++)
                   if(a[j].id==d)
                     {
                         pos=j;
                         break;
                     }
                  a[pos]=null;
              }  

   void display()
    {
       for(int j=0;j<i;j++)
        {
          if(a[j]!=null)
           {
              System.out.println("id: "+a[j].id);
              System.out.println("name: "+a[j].name);
              System.out.println("city: "+a[j].city);
              System.out.println("pin: "+a[j].pin);
          }
       }
    }
}

class Work
{
   public static void main(String args[]) throws IOException
    {
       Scanner sc=new Scanner(System.in);
        int s;
        System.out.print("enter no. of person: ");
         s=sc.nextInt();
        AddressBook ob=new AddressBook(s);
         while(true)
           {
                System.out.println("enter choice");
                System.out.println("1: insert");
                System.out.println("2: delete");
                System.out.println("4: display");
                int c=sc.nextInt();
                switch(c)
                  {
                     case 1: ob.insert();
                                  break;
                     case 2: ob.delete();
                                  break;
                     case 4: ob.display();
                                 break;
                     default: System.out.print("invalid choice");
                                 System.exit(0);
                  }
              System.out.println("do you want to continue? yes/no");
              String n=sc.nextLine();
              sc.nextLine();
             if(n.equals("no"))
             System.exit(0);
          }
      }
}

