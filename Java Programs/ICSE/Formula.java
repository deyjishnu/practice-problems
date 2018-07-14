import java.io.*;
class Formula
{
public static void main(String args[])throws IOException
{
int a=0,b=0,c=0;
for(b=0;b<100;b++)
{
for(a=b+10;a<100;a++)
{
c=a*a-b*b;
if((c==2)||(c==6)||(c==10)||(c==14)||(c==18)||(c==22)||(c==26)||(c==30)||(c==34)||(c==38)||(c==42)||(c==46)||(c==50)||(c==54)||(c==58)||(c==62)||(c==66)||(c==70)||(c==74))
System.out.println(">> "+a+"*"+a+" - "+b+"*"+b+" = "+c);
else
System.out.println(">> "+a+"*"+a+" - "+b+"*"+b+" = "+c);
}
}
}
}