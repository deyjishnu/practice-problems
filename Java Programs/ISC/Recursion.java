//prog to find the factorial of a number using recursion
class Recursion
{
public void accept(int n)
{
int x;
x=fact(n);
System.out.println("The factorial of "+n+" is "+x);
}
public int fact(int a)
{
if(a==1)
return 1;
else
return(a*fact(a-1));
}
}