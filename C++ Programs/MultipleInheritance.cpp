#include<iostream>
#include<conio.h>
using namespace std;
class A
{

protected:
    int  a;
public:
    void get_a(int x)
    {
        a=x;

    }
};
class B
{

    protected:
    int  b;
    public :
        void get_b(int c)
        {
            b=c;

        }
};
class C:public A,public B
{
    int e;
public :
    void disp()
    {
        cout<<a*b*e;

    }
    void get_c(int z)
    {
        e=z;

    }
};
int main()
{

    C s;
    s.get_a(10);
    s.get_b(20);
    s.get_c(30);
    s.disp();
    getch();
    return 0;
}


