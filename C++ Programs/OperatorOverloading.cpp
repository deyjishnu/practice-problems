#include <iostream>
#include <conio.h>
using namespace std;
class Space
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
      void operator-();
};
void Space :: operator-()
{
     x=-x;
     y=-y;
     z=-z;
}
int main()
{
    Space s;
    s.getdata(1,2,3);
    s.display();
    -s;
    s.display();
    getch();
    return 0;
}
