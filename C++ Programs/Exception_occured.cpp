#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
	int a,b,x;
	cout<<"Enter first number";
	cin>>a;
	cout<<"Enter Second number";
	cin>>b;
	x=a-b;
	try{
		if (x!=0)
		cout<<a/x;
		else 
		throw(x);
		}
		catch(int x)
		{
			cout<<"Exception occured";
		}
	getch();
	return 0;
}
