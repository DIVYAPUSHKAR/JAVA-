class myThread extends Thread
{
public void run ()
{
System.out.println("thread is running");
}
}
class Thread1
{
public static void main(String args[])
{
myThread obj=new myThread();
obj.start();
}
}
