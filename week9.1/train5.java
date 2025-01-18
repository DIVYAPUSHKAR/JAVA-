import java.util.*;
class BookBerth extends Thread
{
int avl=100;
int i=0;
int req;
synchronized void book(int req)
{
if(req<=avl) 
{
System.out.println("Booking------");
this.i=i+1;
this.avl=avl-req;
print(req);
}
else
{
display();
}
}
public void print(int req)
{
System.out.println(req+" Berths confirmed");
System.out.println("Available :"+avl);
System.out.println("person" +i+ " booked ticket");
System.out.println("Enter required no of berths:");
}
public void display()
{
System.out.println("No berths available");
System.out.println("Enter required no of berths as per availability:");
}
}
public class train5 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in); BookBerth b=new BookBerth();
System.out.println("Enter required no of berths:");
for(int i=1;i<=5;i++)
{
if(b.avl<=0)
break;
int r=sc.nextInt();
new Thread()
{
public void run()
{
b.book(r);
}
}
.start();
}
}
}

