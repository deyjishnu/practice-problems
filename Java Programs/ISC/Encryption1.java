import java.io.*;  //java class library
class Encryption1
{
String s,s2="";
char ch,ch2;
int i,j,n,l,c;
public void accept()throws IOException
   {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //Activating Buffer
    System.out.println("Enter a sentence -->");
    s=br.readLine();
    l=s.length();
    if(l>=100)
    System.exit(0);
    System.out.println("Enter shift number -->");
    n=Integer.parseInt(br.readLine());
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        c=(int)ch;
        if((c+n-1)<=90)
        {
            ch2=(char)(c+n-1);
            if(ch=='Q' && s.charAt(i+1)=='Q')
            ch2=' ';
        }
        else
        ch2=(char)(c+n-1-90+65);
        s2=s2+ch2;
    }
    System.out.println("Decoded Text -->"+s2);
    }
}