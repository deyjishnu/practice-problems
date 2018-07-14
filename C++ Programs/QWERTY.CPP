#include<iostream.h>
#include<conio.h>
class Xyz;
class Abc
{
   int a;
   public:
   void setval(int m)
   {
   a=m;
   }
   friend int max(Abc,Xyz);
};
class Xyz
{
int b;
friend int max (Abc,Xyz);
public:
void setval(int m)
{
b=m;
}
};
int max(Abc A,Xyz X)
{
if(A.a>=X.b)
return (A.a);
else
return(X.b);
}
void main()
{
Abc m;
Xyz n;
m.setval(10);
n.setval(20);
cout<<max(m,n);
getch();
}
