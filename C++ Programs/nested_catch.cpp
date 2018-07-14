#include<iostream>
#include<conio.h>
using namespace std;
void test(int);
int main()
{
	test(1);
	test(0);
	test(-1);
	test(2);
	getch();
	return 0;
	
}
void test(int x)
{
	try{
		if(x==0)
		throw(x);
		if(x==1)
		throw('x');
		if(x==-1)
		throw(1.2);
		if(x==2)
		throw('x');
		
		
		cout<<"End of the block";
		}
		catch(char c)
		{
			cout<<"Caught char";
		}
				catch(double c)
		{
			cout<<"Caught double";
		}
			catch(int c)
		{
			cout<<"Caught int";
		}
}
