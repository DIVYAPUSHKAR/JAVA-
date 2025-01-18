import java.util.*;
class ticket extends Thread
{
public void run()
{
int i,n;
System.out.println("enter the n value");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;i++)
{
try
{
System.out.println("person  "+i+"  bought the ticket");
Thread.sleep(1000);
System.out.println("person  "+i+"  shown the ticket to the boy");
Thread.sleep(1000);
System.out.println("person  "+i+"  enter the theater");
Thread.sleep(3000);
System.out.println(" ");
}
catch(Exception e)
{
System.out.println(e);
}
}}}
class movie
{
public synchronized static void main(String...args)
{
ticket t=new ticket();
t.start();
}}

