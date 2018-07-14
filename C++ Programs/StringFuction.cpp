#include <iostream>
#include <conio.h>
using namespace std;
class String
{
      char *str;
      public:
             String(char *s=NULL);
             ~String();
             String operator+(String &s);
             char operator[](int n);
             friend ostream& operator<<(ostream& out,String s);
};
String::String(char *s)
{
      int len=0;
      if(s!=NULL)
      {
            while(*(s+len)!='\0')
            len++;
      }
      str=new char[len+1];
      for(int i=0;i<=len;i++)
      str[i]=s[i];
}
String::~String()
{
      delete [] str;
}
String String::operator+(String& s)
{
      String result;
      int len1=0;
      int len2=0;
      int i,j;
      while(str[len1]!='\0')
      {
            len1++;
      }
      while(s.str[len2]!='\0')
      {
            len2++;
      }
      result.str=new char[len1+len2+1];
      for(i=0;i<len1;i++)
      result.str[i]=str[i];
      for(j=0;j<len2;j++)
      {
            result.str[i]=str[j];
            i++;
      }
      result.str[i]='\0';
      return result;
}
ostream& operator<<(ostream& out,String s)
{
      out<<s.str;
      return out;
}                                                                                                                                    
int main()
{
      String s("Hello");
      String t("World");
      String r;
      r=s+t; 
      getch();
      return 0;
}
