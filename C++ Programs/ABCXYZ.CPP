#include<iostream.h>
#include<conio.h>

class code
{
   int id;
   public:
   void display();
   code(int);
   code(code &x)
   {
   id=x.id;
   }
   };
   void code::display()
   {
    cout<<id;
    }
    code ::code(int a)
    {
    id=a;
    }
    void main()
    {
     clrscr();
     code A(100);
     code B=A;
     code C(A);
     A.display();
     B.display();
     C.display();
     getch();
     }
