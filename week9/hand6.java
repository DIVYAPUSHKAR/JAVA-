class MyException extends Exception
{
MyException(String msg)
{
super(msg);
}
}
class Test
{
void display(int x)throws MyException
{
System.out.println("Throwing MyException");
throw new MyException("Exception occurred");
}
}
public class hand6
{
public static void main(String[] args)
{
Test obj=new Test();
try
{
obj.display(6);
}
catch(MyException e)
{
System.out.println("Catching MyException");
System.out.println(e.getMessage());
}
}
}
