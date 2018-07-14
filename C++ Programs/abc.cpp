#include<iostream>
#include<conio.h>
using namespace std;
void area(int,double);
double vol(double,double,double);
 void vol(int,int, double);
int area(int,int);
int main()
                  {
                 double a=2.5,b=3.6,c=1.2;
                 int m=2,n=3;
                 double res1,res2;
                 res1=vol(a,b,c);
                 vol(m,n,a);
                 res2=area(m,n);
                 area(n,b);
                 cout<<'\n';
                 cout<<res1;
                 cout<<'\n';
                 cout<<res2;
                 getch();
                 return 0;
                 }
                 double vol(double m,double x,double b)
                 {
                        return(m*x*b);
                 }
                 void vol(int a,int b, double c)
                 {
                      double res;
                      res=a*b*c;
                      cout<<res;
                 }             
                 int area(int a,int b)
                 {
                     return(a*b);
                     
                 }   
                 void area(int n,double b)
                 {
                      double rs;
                      rs=n*b;
                      cout<<'\n';
                      cout<<rs;
                 }   
                 //
