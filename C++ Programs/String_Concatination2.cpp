#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;
int main(){
	string s1="ABC";
	string s2="XYZ";
	int x=s1.compare(s2);
	if(x==0)
	cout<<"s1=s2";
	else if(x>0)
	cout<<"s1>s2";
	else 
	cout<<"s1<s2";
	getch();
	}

