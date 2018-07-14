#include<iostream>
#include<conio.h>
using namespace std;
int Divide(int, int, int);
int main()
{
	try{
		Divide(10,20,10);
		Divide(10,10,30);
		}
	catch(int R){
		cout<<"Exception occured";
		}
getch();
return 0;
}
int Divide(int x,int y,int z)
{
	int R=(x-y)/z;
	if(R==0)
	throw(R);
	else
	cout<<R;
}
	
