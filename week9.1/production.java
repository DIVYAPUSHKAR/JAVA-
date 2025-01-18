import java.util.Scanner;
class myThread extends Thread
{
public void run ()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n:");
int n=sc.nextInt();
int i;
for(i=1;i<n;i++)
{
try
{
Thread.sleep(1000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("not over");
}
System.out.println(" over");
}
}
class production
{
public static void main(String args[]){
myThread obj=new myThread();
obj.start();
}
}

