#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;
int main(){
	string s1;
	cout<<s1.length();
	cout<<"\n"<<s1.size();
	cout<<"\n"<<s1.capacity();
	cout<<"\n"<<s1.max_size();
	int x=s1.empty();
	if(x==1)
	cout<<"\nEmpty";
	else
	cout<<"\nNot empty";
	s1="abcdef";
	cout<<"\n"<<s1.length();
	cout<<"\n"<<s1.size();
	cout<<"\n"<<s1.capacity();
	cout<<"\n"<<s1.max_size();
	int x1=s1.empty();
	if(x1==1)
	cout<<"\nEmpty";
	else
	cout<<"\nNot empty";
	getch();
}

