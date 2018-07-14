class cons
{
int a,b;   //Global variables
String s;   //Global variables
public cons()   //default constructor(has to be a non-parameterised constructor,no return type)
{
a=0;
b=0;
s="";
}
public void cons(int a)   //parameterised constructor(though a constructor, it has a return type. Because it is not the default constuctor)
{
this.a=a;  //'this' keyword is used to specify that, by 'a' we mean 'a' of that object through which the function is called(here this.a means ob.a)
}
public void cons(String s)   //parameterised constructor(though a constructor, it has a return type. Because it is not the default constuctor)
{
this.s=s;
}
public void accept(String args[])
{
a=Integer.parseInt(args[0]);//As args[] is a string array, the values entered through it are strings. So we have to convert them into other types when required
b=Integer.parseInt(args[1]);
s=args[2];
cons ob=new cons();  //creating the object and initialising the variables of the object ob through the default constructor
System.out.println("calling cons(int a)....");
ob.cons(a);  // calling the first parameterised constructor
System.out.println("calling cons(String s)....");
ob.cons(s);  // calling the second parameterised constructor
System.out.println("Global variables -->");
System.out.println("a="+a);
System.out.println("b="+b);
System.out.println("s="+s);
System.out.println("Variables of object ob -->");
System.out.println("ob.a="+ob.a);
System.out.println("ob.b="+ob.b);
System.out.println("ob.s="+ob.s);
}
}