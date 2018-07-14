import java.io.*;  //java class library
class ToughString
{
public static void main(String args[])throws IOException  //Value accept
{
String s="",w="",temp="";
String st[]=new String[20];
char ch;
int l=0,k=0,i,j;  
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //Activating Buffer
   System.out.println("Enter a sentence -->");
   do
   {
   ch=(char)br.read();
   l++;
   if(ch=='.')
   break;
   s=s+ch;
   }
  while(l<40);
  s=s+" ";
  for(i=0;i<l;i++)
  {
     ch=s.charAt(i);
     if(ch!=' ')
     w=w+ch;
     else
     {
     if(w=="")
     continue;
     st[k++]=w;
     w="";
    }
}
System.out.println("STRING WORDS ");
for(i=0;i<k;i++)
System.out.println(st[i]);
//computation of sorting
for(i=0;i<k;i++)
{
for(j=0;j<k-1-i;j++)
{
if(st[j].length()>st[j+1].length())
{
temp=st[j];
st[j]=st[j+1];
st[j+1]=temp;
}
if(st[j].length()==st[j+1].length())
{
if(st[j].compareTo(st[j+1])>0)
{
temp=st[j];
st[j]=st[j+1];
st[j+1]=temp;
}
}
}
}
System.out.println("AFTER SORTING THE WORDS ARE ");
for(i=0;i<k;i++)
System.out.println(st[i]);
}
}