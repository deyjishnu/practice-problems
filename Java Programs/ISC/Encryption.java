import java.io.*;  //java class library
class Encryption
{
  public static void main()throws IOException
  {
     String s,s1;s1="";
     int i,l,p,x,y;y=0;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //Activating Buffer
     System.out.println("Enter a sentence -->");
     s=br.readLine();
     l=s.length();
     System.out.println("Enter shift number -->");
     p=Integer.parseInt(br.readLine());
     for(i=0;i<l;i++)
     {
         x=(int)s.charAt(i);   // ASCII code of the 'i'th character
         if(Character.isLetter(x))  //if character is a letter
         {
             if(p>0)   //if p is positive
             {
                 if(((x>=65 && x<=90)&&(x+p>90))||((x>=97 && x<=122)&&(x+p>122)))
                 y=x+p-26;
                 else
                 y=x+p;
             }
             else if(p<0)  //if p is negative
             {
                 if(((x>=65 && x<=90)&&(x+p<65))||((x>=97 && x<=122)&&(x+p<97)))
                 y=x+p+26;
                 else
                 y=x+p;
             }
         }
         else   //if character is not a letter
         y=x;
         s1=s1+(char)y;   //Encrypted string
     }
     System.out.println(s1);
  }
}