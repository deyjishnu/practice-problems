#include <iostream>
#include <conio.h>
using namespace std;
class line
{
      double length;
      public:
             void setlength(double);
             double getlength(void);
             line();
             line(double);
};
line::line()
{
      cout<<"Creating Object";
}
line::line(double l)
{
      length=l;
}
void line::setlength(double a)
{
length=a;
}
double line::getlength()
{
      return length;
}
int main()
{
    line ln1;
    line ln(100.0);
    ln1.setlength(99.5);
    cout<<ln1.getlength();
    cout<<ln.getlength();
    getch();
    return 0;
}

//Creating Object99.5100
