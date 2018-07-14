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

     friend void operator-(Space &);
};
void operator-( Space &S)
{
     S.x=-(S.x);
     S.y=-(S.y);
     S.z=-(S.z);
}
int main()
{
    Space s;
    s.getdata(1,2,3);
    s.display();
    cout<<endl;
    operator-(s);
    s.display();
    getch();
    return 0;
}
