import java.io.*;
import intman.*;
class Experiment
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public void accept()throws IOException
    {
        int n,s,r,o;
        int x[]={5,3,1,2,4};
        System.out.println("Enter a number -->");
        n=Integer.parseInt(br.readLine());
        digman ob=new digman();
        arrman ob1=new arrman();
        s=ob.sod(n);
        System.out.println("Sum of digits of "+n+" is "+s);
        r=ob.reverse(n);
        System.out.println("Reverse of "+n+" is "+r);
        o=ob.occurence(n,3);
        System.out.println("Occurence of 3 in "+n+" is "+o);
        ob1.sort(x);
    }
    public static void main(String args[])throws IOException
    {
        Experiment obj=new Experiment();
        obj.accept();
    }
}