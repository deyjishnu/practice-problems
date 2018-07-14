#include<iostream>
#include<conio.h>
#include<string.h>
using namespace std;
int main(){
	string s1="ABCDE";
	string s2="1234";
	//s1.insert(2,s2);
	//cout<<s1;
	s2.replace(1,2,s1);
	cout<<s2;
	getch();
}
