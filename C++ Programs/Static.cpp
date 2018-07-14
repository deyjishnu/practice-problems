#include<iostream>
#include<conio.h>
using namespace std;
class A
{
      int a;
      public:
      A();
      static int count;
      void setlength();
      int getlength();
};
int A::count=5;
A::A()
{
       cout<<"No. of object"<<count;
       count ++;
}
       int main()
       {
           A a;
           A b;
          getch();
           return 0;
       }
//No. of object5No. of object6
      
