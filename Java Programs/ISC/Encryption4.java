import java.io.*;  //java class library
class Encryption4
{
  public static void main()throws IOException
  {
     String s,s1;s1="";
     int i,l,p,x,y;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //Activating Buffer
     System.out.println("Enter a sentence -->");
     s=br.readLine();
     l=s.length();
     System.out.println("Enter shift number -->");
     p=Integer.parseInt(br.readLine());
     for(i=0;i<l;i++)
     {
         x=(int)s.charAt(i);
         if((x>=65 && x<=90)||(x>=97 && x<=122))
         {
             if(x+p>122)
             y=x+p-26;
             else if((x+p>97)&&(x+p<=122))
             y=x+p;
             else if(x+p>90)
             y=x+p-26;
             else
             y=x+p;
         }
         else
         y=x;
         s1=s1+(char)y;
     }
     System.out.println(s1);
  }
}