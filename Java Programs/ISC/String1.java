import java.io.*;  //java class library
class String1
{
public static void main()throws IOException
   {
    String s,w="",temp;
    char ch;
    int i,j,k,l,c=0;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //Activating Buffer
    System.out.println("Enter a string -->");
    s=br.readLine();
    l=s.length();
    String s1[]=new String[10];
    for(i=0;i<l;i++)
    {
        ch=s.charAt(i);
        if(ch==' ')
        {
            s1[c]=w;
            c++;
            if(s.charAt(i+1)=='.'||s.charAt(i+1)=='?'||s.charAt(i+1)==','||s.charAt(i+1)==';'||s.charAt(i+1)=='!')
            {
                for(j=0;j<c;j++)
                {
                    for(k=0;k<c-1-j;k++)
                    {
                        if((s1[k].compareTo(s1[k+1]))>0)
                        {
                             temp=s1[k];
                             s1[k]=s1[k+1];
                             s1[k+1]=temp;
                            }
                        }
                    //FOR DISPALY
                    for(j=0;j<c;j++)
                    System.out.print(s1[j]+" ");
                }
                    //FOR CREATING BLANKS SPACES INTO ARRAY
                        for(j=0;j<10;j++)
                        System.out.print(s1[j]="");
                    
            }
        }
        else
        w=w+ch;
    }
}
}