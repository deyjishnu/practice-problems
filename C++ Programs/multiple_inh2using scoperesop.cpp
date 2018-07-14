#include<iostream>
using namespace std;
class A
{

public:
    void disp()
    {
        cout<<"in A";

    }
};
class B
{

public:
    void disp()
    {
        cout<<"in B";

    }
};
class C:public A,public B
{
public:
    void disp()
    {

        cout<<"in C";
        A::disp();
    }

};
int main()
{

    C s;
    s.disp();
    cout<<endl;
    s.B::disp();
    return 0;

}
