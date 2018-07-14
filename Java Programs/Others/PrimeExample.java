import java.util.Scanner;
class PrimeExample{
    public static boolean isPrime(long n){
        long i,flag=0;
        for(i=2;i<=n;i++)
        {    
            if(n%i==0)
            {  
                flag=1;
                return false;
            }
        }
        if(flag==0)
        return true;
        else
        return false;
    }
    public static void main(String args[]){  
        long i,a=2,c=0;
        Scanner s = new Scanner(System.in); 
        long n;
        System.out.print("Enter a number ");
        n = s.nextLong();
        for(i=3;i<=n;i++)
        {
            if(isPrime(i))
            {
                a=a+i;
                if(isPrime(a)&& a<=n)
                c=c+1;
            }
        }
        System.out.print(c);
    }
}