
class or2
{
void m1()
{
System.out.println("Before overriding method 1");
}void m2()
{
System.out.println("Before overriding method 2");
}
}
class override extends or2
{
void m1()
{
System.out.println("After overriding method 1");
}
void m2()
{
System.out.println("After overriding method 2");
}
public static void main(String args[])
{
override c1= new override();
c1.m1();
c1.m2();
}
}
