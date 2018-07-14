/*program to accept a string and print a L-pattern
Enter a string -->
COOL
L-Patten -->
C       
O       
O       
L O O C */
import java.io.*;
class L_Pattern
{
String s;
int l,i,j;
public void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter a string -->");
s=br.readLine();
}
public void display()
{
l=s.length();
char ch[][]=new char[l][l];
for(i=0;i<l;i++)
ch[i][0]=s.charAt(i);
for(i=1;i<l;i++)
ch[l-1][i]=s.charAt(l-i-1);
System.out.println("L-Patten -->");
for(i=0;i<l;i++)
{
for(j=0;j<l;j++)
System.out.print(ch[i][j]+" ");
System.out.println();
}
}
}