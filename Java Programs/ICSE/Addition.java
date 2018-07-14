import java.io.*;
class Addition
{
public static void main(String args[])
{
int a=15,b=20,c=25,sum=0;
Addition obj=new Addition();
sum=obj.jishnu(a,b,c);//CALLING FUNCTION
System.out.println("this is first time Sum="+sum);
obj.jishnu1(a,b,c);
}
int jishnu(int d,int e,int f)//CALLED FUNCTION
{
//int sum=0;
//d+e+f;
return(d+e+f);
}
void jishnu1(int d,int e,int f)
{
System.out.println("result of product ="+(d*e*f));
}
}