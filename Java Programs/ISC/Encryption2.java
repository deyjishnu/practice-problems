import java.io.*;  //java class library
class Encryption2
{
  public static void main()throws IOException
  {
     String s;
     int i,j,k,len,n;
     char s1[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
     char s2[]=new char[26];
     char ch;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //Activating Buffer
     System.out.println("Enter a sentence -->");
     s=br.readLine();
     s=s.toUpperCase();
     len=s.length();
     if(len>=100)
     System.exit(0);
     System.out.println("Enter shift number -->");
     n=Integer.parseInt(br.readLine());
     k=65;
     for(i=n-1;i<26;i++)
     {
         s2[i]=(char)k;
         k++;
     }
     for(i=0;i<n-1;i++)
     {
         s2[i]=(char)k;
         k++;
     }
     System.out.println("Decoded Text -->");
     for(i=0;i<len;i++)
     {
         ch=s.charAt(i);
         for(j=0;j<26;j++)
         {
             if(ch==s2[j])
             break;
         }
         if(s1[j]=='Q' && s.charAt(i+1)==ch)
         {
             System.out.print(" ");
             i++;
         }
         else
         System.out.print(s1[j]);
     }
  }
}