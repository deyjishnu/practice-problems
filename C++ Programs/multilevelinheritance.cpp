#include<iostream>
#include<conio.h>
using namespace std;
class Student
{
protected:
          int roll;
          public:
                void get_roll(int x)
                {
                     roll=x;
                }      
};
class test: public Student
{
protected:
float m1,m2;
public:
       void get_mark(int x,int y)
       {
          m1=x;  
          m2=y;
       }      
};
class result : public test
{
float tot;
public:
void display()
{
tot=m1+m2;
cout<<roll;
cout<<tot;     
}      
};
int main()
{
result s;
s.get_roll(10);
s.get_mark(1,2);
s.display();   
getch();
return 0;  
}
