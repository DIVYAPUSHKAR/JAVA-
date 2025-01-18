class this5
{
this5(int x, int y, int z)
{
this(x,y);
System.out.println("Value of z:"+z);
}
this5(int x, int y)
{
this(x);
System.out.println("Value of y:"+y);
}
this5(int x)
{
System.out.println("Value of z:"+x);
}
}

class Demo
{
public static void main(String aa[])
{
this5 e=new this5(5,10,15);
}
}
//b. Example for super keyword
class Vehicle
{
int maxSpeed = 120;
}
//sub class Car extending vehicle
class Car extends Vehicle
{
int maxSpeed = 180;
void display()
{
//print maxSpeed of base class (vehicle)
System.out.println("Maximum Speed of Vehicle : " +super.maxSpeed);
System.out.println("Max speed of car : "+maxSpeed);
}
}
//Driver program to test
class Test
{
public static void main(String[] args){

Car small = new Car();
small.display();
}
}
//c. Example for static variables and method
class stat6
{
static //Static Block
{
System.out.println("Your in Static Block");
}
static void display() //static method
{
System.out.println("Iam Static method");
}
static int a=5;//Static Variable
public static void main(String args[])
{
System.out.println(stat6.a);
stat6.display();
}
}
