#include<iostream>
#include<conio.h>
using namespace std;
class A
{
      int a;
      
      public:
             void get_a(int x)
             {
             a=x;     
             }
};
class B: public A
{
int b;
public:

       void get_b (int x)
       {
       b=x;     
       }   
       void disp()
       {
       cout<<b;     
       }   
};
int main()
{
B b;
b.get_b(20);
b.get_a(10);
b.disp();     
getch();
return 0;
}
