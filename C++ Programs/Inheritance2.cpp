#include <iostream>
#include <conio.h>
using namespace std;
class A
{
      int a;
      public:
             int get_a(int x)
             {
                  a=x;
                  return a;
             }
};
class B:private A
{
      int b;
      public:
             void get_b(int x)
             {
                  b=x;
             }
             void disp()
             {
                  cout<<b*get_a(10);
             }
};
int main()
{
       B b;
       b.get_b(20);
       b.disp();
       getch();
       return 0;
}
