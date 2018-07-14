#include<iostream>
#include<conio.h>
using namespace std;
void divide(double x, double y);
int main()
{
cout<<"Inside main";
try{
	divide(10.5,2.0);
	divide(20.0,0.0);
}	
catch(double){
	cout<<"Caught Double inside main";
}
cout<<"End of main";
getch();
return 0;
}
void divide(double x, double y){
	cout<<"Inside divide";
	try{
		if(y==0.0)
		throw(y);
		else 
		cout<<x/y;
		}
		catch(double){
			cout<<"Caught within the function";
			throw;
		}
		cout<<"End of function";
}
