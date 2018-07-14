#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;
int main()
{
	string s1;
	string s2="NEW";
	s1=s2;
	cout<<s1<<"\n"<<s2;
	string s3="DEFAULT";
	//string s4=s2+s3;
	//cout<<"\n"<<s4; 
	cout<<"\n"<<s2+s3;
	getch();
	return 0;
}
