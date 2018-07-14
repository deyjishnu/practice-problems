import java.io.*;
class Alphabet_Pattern4
{
public static void main(String args[])throws IOException
{
int i,j,k;
for(i=0;i<=3;i++)//for holding rows
{
for(j=0;j<i;j++)
System.out.print(" ");//for holding blank spaces
for(k=0;k<=3-i;k++)
{
System.out.print("a");
}
System.out.println();
}
}
}

