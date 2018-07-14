import java.io.*;
class temperature
{
public static void main(String args[])throws IOException
{
int i;
String city[]=new String[5];
double farhen[]=new double[5];
double celcius[]=new double[5];
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
for(i=0;i<5;i++)
{
System.out.println("Enter the city name :-");
city[i]=br.readLine();
System.out.println("Enter the temperature in Farhenheit :-");
farhen[i]=Double.parseDouble(br.readLine());
celcius[i]=(5*(farhen[i]-32))/9;
}
System.out.println("CITY           FARHENHEIT              CENTIGRADE");
System.out.println("-----          ----------              ----------");
for(i=0;i<5;i++)
{
System.out.println(city[i]+"           "+farhen[i]+"          "+celcius[i]);
}
}
}
      
