#include <iostream>
#include <conio.h>
using namespace std;
class complex
{
      float real;
      float imag;
      public:
      complex(int a,int b)
      {
            real=a;
            imag=b;
      }
      void putdata()
      {
           cout<<real;
           cout<<imag;
      }
      complex operator+ (complex);
};
complex complex::operator+ (complex c)
{
      complex temp;
      temp.real=real+c.real;
      temp.imag=imag+c.imag;
      return temp;
}
int main()
{
     complex c1(2.5,3.5);
     complex c2(1.2,3.7);
     c1.putdata();
     c2.putdata();
     complex c=c1+c2;
     c.putdata();
}
