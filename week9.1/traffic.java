import java.util.*;
class traffic extends Thread{
public void run(){
Scanner sc=new Scanner(System.in);
System.out.println("enter the n value:");
int n=sc.nextInt();
int i;
for(i=0;i<n;i++)
{
try{
System.out.println("Start");
System.out.println("the red is on");
Thread.sleep(10000);
System.out.println("the red is off");
System.out.println("the yellow is glowing");
Thread.sleep(10000);
System.out.println("the yellow is off");
System.out.println("the green is on");
Thread.sleep(10000);
System.out.println("the green is off");
}
catch(Exception e){
System.out.println(e);
}
}
}
}
class main
{
public static void main(String args[]){
traffic  obj=new traffic();
obj.start();
}}
