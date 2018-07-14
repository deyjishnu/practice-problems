//prog. to find all the prime palindrome numbers between a range
import java.io.*;//Java Class Library
class primepalin2
{
int u,l,i,a,m,c;
public void getData()throws IOException
    {
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//Activating Buffer
    System.out.println("Enter the lower limit :-");
    u=Integer.parseInt(br.readLine());
    System.out.println("Enter the upper limit :-");
    l=Integer.parseInt(br.readLine());
    }
public void prime() //To calculate the prime nos.
    {
    int j;
    for(i=l;i<=u;i++)
      {
      c=0;
      for(j=2;j<i;j++)
        {
        if(i%j==0)
        c++;
        break;
        }
      }
    }
public void palindrome()  //To calculate the palindrome nos.
    {
    int pr=m=i,a=0;
    if(c==0)
    {
    do
      {
      a=a*10+pr%10;
      pr=pr/10;
      }
    while(pr>0);
    }
    }
public void diplay()  //To display the prime palindrome nos.
    {
    if(a==m)
    System.out.println("The prime palindrome nos. are :-"+m);
    }
}