#include<iostream>
#include<conio.h>
using namespace std;
class A
{
      protected:
                int a;
      
      public:
      void get_a(int x)
      {
           a=x;
      }
};
class B
{
      protected:
                int b;
    
      public:
      void get_b(int x)
      {
           b=x;
        
      }
      
};
class C : public A, public B
{
      int c;
      public :
        void get_c(int x)
      {
           c=x;
        
      }      
             
      void disp()
      {
          
           cout<< a*b*c<<"\n";
          
      }
};
int main()
{
   C s;
     s.get_a(10);
     s.get_b(20);
      s.get_c(30);
     s.disp();
     getch();
     return 0;
}                      
                      
           
