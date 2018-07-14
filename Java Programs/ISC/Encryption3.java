import java.io.*;  //java class library
class Encryption3
{
public static void main()throws IOException
   {
    String s,s1="";
    char ch;
    int i,j,l,c;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //Activating Buffer
    System.out.println("Enter a string -->");
    s=br.readLine();
    l=s.length();
    if(l>30)
    {
        System.out.println("The string should not be more than 30 characters !!");
        System.exit(0);
    }
    if(s.charAt(l-1)!='.')
    {
        System.out.println("The string should terminate with a full stop !!");
        System.exit(0);
    }
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch==' ' || ch=='.')
        s1=s1+ch;
        else
        {
        c=(int)ch; 
        if((c>=65 && c<88)||(c>=97 && c<=120))
        s1=s1+(char)(c+2);
        else
        if(c==89 || c==90 || c==121 || c==122)
        s1=s1+(char)(c-24);
        }
    }
    System.out.println("The encrypted string -->"+s1);
    }
}