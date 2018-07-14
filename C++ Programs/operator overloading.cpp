#include<iostream>
#include<conio.h>
using namespace std;
class space
{
      int x;
      int y;
      int z;
     public:
          void getdata(int a,int b,int c)
          {
               x=a;
               y=b;
               z=c;
          }
          void display()
          {
               cout<<x;
               cout<<y;
               cout<<z;
          }
         friend void operator-(space &);
};
void operator-(space & s)
{
     s.x=-s.x;
     s.y=-s.y;
     s.z=-s.z;
}
int main()
{
     space s;
     s.getdata(1,2,3);
     s.display();
     operator-(s);
     s.display();
     getch();
     return 0;
}          
