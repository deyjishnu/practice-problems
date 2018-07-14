#include<iostream>
#include<conio.h>
#include<stdlib.h>
using namespace std;
class complex
{
      double real,img;
      public:
             complex()
             {
                      }
             complex(double a ,double b)
             {
                            real=a;
                            img=b;
                            }
             complex  operator+(complex );
             void disp()
             {
                  cout<<"Real :"<<real;
                  cout<<" Img :"<<img;
                  }
                  friend complex operator+(complex ,complex);
};

int main()
{
    complex c1(10.5,21.5);
    complex c2(12.5,13.5);
    complex c=operator+(c1,c2);
    c1.disp();
    cout<<endl;
    c2.disp();
    cout<<endl;
    c.disp();
    getch();
    return 0;
}
 complex operator+(complex c,complex c1)
{
        complex temp;
        temp.real= c.real +c1.real;
        temp.img=  c.img +c1.img;
        return temp;
}
