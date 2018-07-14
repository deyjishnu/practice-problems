import java.io.*;
class Inheritance1
{
String name;
int roll;
void inputdata()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the name -->");
name=br.readLine();
System.out.println("Enter the roll no. -->");
roll=Integer.parseInt(br.readLine());
}
}