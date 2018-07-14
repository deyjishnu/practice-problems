#include<iostream>
#include<conio.h>
using namespace std;

class String
{
      char *Str;
      public:
             String(char *s);
             ~ String();
            String operator+(String &s);
             char operator[](int n);
             friend ostream& operator<<(ostream & out,String s);
};
String :: String(char *s=NULL)
{
       int len=0;
       if(s!=NULL)
       {
                  while(*(s+len)!='\0')
                  {
                                       len++;
                  }
                  Str=new char[len+1];
                  for(int i=0; i<=len; i++)
                  {
                          Str[i]=s[i];
                  }
       }
       
}
String :: ~String()
{
       delete[] Str;
}
String String :: operator+ (String& s)
{
       String result;
       int len=0;
       int i;
       while(Str[len]!='\0')
       {
                            len++;
       }
       while(s.Str[i]!='\0')
       {
                            i++;
                            len++;
       }
result.Str=new char[len+1];
i=0;
while(Str[i]!='\0')
{
                   result.Str[i]=Str[i];
                   i++;
}
len=0;
while(s.Str[i]!='\0')
{
                   result.Str[i]=s.Str[i];
                   i++;
                   len++;
} 
result.Str[i]='\0';
return result;
}                 
                                       
int main()
{
    String s("hello");
    String t("world");
    String r;
    r=s+t;
    cout<<r;
    getch();
    return 0;
}                 
