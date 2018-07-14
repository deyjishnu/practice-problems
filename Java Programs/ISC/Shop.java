//program to accept 4 SDA for accepting item no. and their respective CP in one and SP in the other and calculate their profit and loss in an array and print them as a chart
import java.io.*;
class Shop
{
int n,i,j,d,k,tp=0,tl=0;
int itm[]=new int[n];       //Declaring all the arrays
int cp[]=new int[n];
int sp[]=new int[n];
int pft[]=new int[n];
int loss[]=new int[n];
int dis[][]=new int[n][5]; 
public void accept()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of items -->");    //Accept the no. of items
n=Integer.parseInt(br.readLine());
for(i=0;i<n;i++)
{
System.out.print("Enter the item no. : ");
itm[i]=Integer.parseInt(br.readLine());
System.out.print("Enter its cost price : Rs.");
cp[i]=Integer.parseInt(br.readLine());
System.out.print("Enter its selling price : Rs.");
sp[i]=Integer.parseInt(br.readLine());
d=sp[i]-cp[i];
if(d>0)
{
pft[i]=d;
loss[i]=0;
tp=tp+d;
}
else
{
pft[i]=0;
loss[i]=0-d;
tl=tl-d;
}
}
}
public void cal()
{
for(i=0;i<n;i++)
{
k=0;
dis[i][k]=itm[i];
k++;
dis[i][k]=cp[i];
k++;
dis[i][k]=sp[i];
k++;
dis[i][k]=pft[i];
k++;
dis[i][k]=loss[i];
}
}
public void display()
{
System.out.println("Item No.   C.P    S.P      Profit   Loss");
System.out.println("-----------------------------------------");
for(i=0;i<n;i++)
{
for(j=0;j<=4;j++)
System.out.print(dis[i][j]+"      ");
System.out.println();
}
System.out.println("----------------------------------------");
System.out.println("                            "+tp+"   "+tl);
System.out.println("-----------------------------------------");
if(tp>tl)
System.out.println("Gross Profit = Rs."+(tp-tl));
else if(tl>tp)
System.out.println("Gross Loss = Rs."+(tl-tp));
else
System.out.println("No gain outcome !! more attention is needed in business ");
}
}