import java.io.*;
class PrimsAlgorithm
{
    int prim(int a[][])
    {
        int n=a.length,i,j,k,min,x=0,y=0,mincost=0;
        int b[]=new int[n];
        b[0]=1;
        for(k=1;k<=n-1;k++)
        {
            min=999;
            for(i=0;i<n;i++)
            {
                if(b[i]==1)
                {
                    for(j=0;j<n;j++)
                    {
                        if(a[i][j]<min)
                        {
                            min=a[i][j];
                            x=i;
                            y=j;
                        }
                    }
                }
            }
            a[x][y]=a[y][x]=999;
            System.out.print("MST contains edges --> ("+x+","+y+")");
            b[y]=1;
            mincost=mincost+min;
        }
        return mincost;
    }
    public static void main(String args[])throws IOException
    {
        int a[][],i,j,n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of vertices -->");
        n=Integer.parseInt(br.readLine());
        a=new int[n][n];
        System.out.println("Enter the weights of each edge -->");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i<j)
                {
                    System.out.print("Edge ("+i+","+j+") --> ");
                    a[i][j]=a[j][i]=Integer.parseInt(br.readLine());
                }
                else if(i==j)
                a[i][j]=999;
                if(a[i][j]==0)
                a[i][j]=999;
            }
        }
        PrimsAlgorithm obj=new PrimsAlgorithm();
        System.out.println("Minimum Cost = "+obj.prim(a));
    }
}