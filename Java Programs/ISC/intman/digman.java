package intman;
public class digman
{
int n,a,b;
    public int sod(int y)
    { 
        n=0;a=0;b=0;
        n=y;
        while(n!=0)
        {
            a=n%10;
            b=b+a;
            n=n/10;
        }
        return(b);
    }
    public int reverse(int x)
    {  
        n=0;a=0;b=0;
        n=x;
        while(n!=0)
        {
            a=(a*10)+(n%10);
            n=n/10;
        }
        return(a);
    }
    public int occurence(int x,int y)
    {
        int c;
        n=0;a=0;b=0;c=0;
        n=x;
        a=y;
        while(n!=0)
        {
            if(a==n%10)
            c++;
            n=n/10;
        }
        return(c);
    }
    public int nod(int x)
    {
         n=0;a=0;
         n=x;
         while(n!=0)
         {
             a++;
             n=n/10;
         }
         return(a);
    }
}