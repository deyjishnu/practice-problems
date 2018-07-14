import java.io.*;  //java class library
class FLAMES
{
public static void main()throws IOException
    {
    String s1,s2,s3;
    s3="FLAMES";
    String s4[]={"Friendship","Love","Attraction","Marriage","Enemy","Sister"};
    char ch;
    int i,j,l,l1,l2,b;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  //Activating Buffer
    System.out.println("Enter the first name -->");
    s1=br.readLine();
    l1=s1.length();
    System.out.println("Enter the second name -->");
    s2=br.readLine();
    l2=s2.length();
    l=l1+l2;
    char a1[]=new char[l1];
    char a2[]=new char[l2];
    for(i=0;i<l1;i++)
    a1[i]=s1.charAt(i);
    for(i=0;i<l2;i++)
    a2[i]=s2.charAt(i);
    for(i=0;i<l1;i++)
    {
        for(j=0;j<l2;j++)
        {
            if(a1[i]==a2[j])
            {
            l=l-2;
            a1[i]=a2[j]=' ';
            break;
            }
        }
    }
    System.out.println("Length --> "+l);
    for(i=0;i<5;i++)
    {
        b=l%(6-i);
        s3=s3.substring(b,6-i)+s3.substring(0,b-1);
    }
    for(i=0;i<6;i++)
    {
        if(s4[i].charAt(0)==s3.charAt(0))
        {
        System.out.println("Relationship --> "+s4[i]);
        break;
        }
    }
   }
}