
#include<iostream>
#include<conio.h>
using namespace std;
class complex
{
      public:
      float real;
      float imag;
      
      complex()
      {
               real = 0.0;
               imag = 0.0;
      }
      complex(float a, float b)
      {
                  real=a;
                  imag=b;
      }
      void putdata()
      {
           cout<<real;
           cout<<imag;
      }
      complex operator+(complex);
};
complex complex::operator+(complex c)
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
     cout<<c.real;
     cout<<c.imag;
     getch();
     return 0;
}
