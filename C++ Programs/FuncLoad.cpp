#include <iostream>
#include <conio.h>
    using namespace std;
    double vol(double,double,double);
    void vol(int,int,double);
    int area(int,int);
    void area(int,double);
    int main()
    {
        double a=2.5,b=3.6,c=1.2;
        int m=2,n=3;
        double res1;
        res1=vol(a,b,c);
        vol(m,n,a);
        int res2=area(m,n);
        area(n,b);
        cout<<res1<<endl;
        cout<<res2;
        getch();
        return 0;
    }
    double vol(double m,double x,double b)
    {
           return(m*x*b);
    }
    void vol(int a,int b,double c)
    {
         double res;
         res=a*b*c;
         cout<<res<<endl;
    }
    int area(int a,int b)
    {
        return(a*b);
    }
    void area(int a,double b)
    {
         double rs;
         rs=a*b;
         cout<<rs<<endl;
    }
/*
15
10.8
10.8
6
*/
