//Write a program in java whether a number is Armstrong or not, using constructor.Project program
import java.io.*;
class armstrong
{
int m,r,d,f,p=0;
armstrong(int n)//CONSTRUCTOR
 {
   m=p=n;
   f=0;
   }
         void cal()   //METHOD
         {
            int a,b,c,s=0;
             while(m>0)
             {
         a=m/10;
         b=a*10;
         c=m-b;
         s=s+c*c*c;
         m=m/10;
        }
        r=s;
           }
            void check()  //METHOD
           {
               
             if(r==p)
                  f=1;
                }
              void display()  //METHOD
            {
              if(f==1)
                 System.out.println("No. is armstrong.");
                    else
                System.out.println("No.is not armstrong.");
             }
      }
           class constructor
           {
               public static void main(String args[])throws IOException
               {
                  armstrong obj=new armstrong(1);   //CREATE OBJECT
                obj.cal();   //CALLING METHOD
                obj.check();   //CALLING METHOD
                obj.display();   //CALLING METHOD
            }
        }
           
