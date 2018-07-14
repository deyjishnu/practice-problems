#include<iostream>
#include<conio.h>
using namespace std;
class A
{
      public:
      void disp()
      {
      cout<<"In A";     
      } };
      class B
      {
      public :
             void disp()
             {
            cout<<"In B";
             }      
      };
      class C: public A,public B
      {
      public:
             void disp()
             {
             cout<<"In C";
             A::disp();     
             }      
      };
      int main()
      {
      C s;
      s.disp();
     s.B::disp();   
      getch();

      return 0;
      }
