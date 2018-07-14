import java.io.*;
class Inheritance2 
{
int marks;
Inheritance1 ob=new Inheritance1();
void getdata()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
ob.inputdata();
System.out.println("Enter the marks -->");
marks=Integer.parseInt(br.readLine());
showdata();
}
void showdata()throws IOException
{
System.out.println("Name   "+ob.name);
System.out.println("Roll no.   "+ob.roll);
System.out.println("Marks   "+marks);
}
}