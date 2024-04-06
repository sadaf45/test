class Add
{
public void add(int a,int b)
{
System.out.println("Addition of two numbers is"+(a+b));
}
void add(int a,int b,int c)
{
System.out.println("expression is"+(a+b-c));
}
public static void main(String args[])
{
Add a1=new Add();
a1.add(3,6);
a1.add(4,5,6);
}
}
