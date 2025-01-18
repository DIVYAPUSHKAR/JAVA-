import java.util.Scanner;
interface Fare {
void getAmount(int K,int C); }
class Bus implements Fare {
public void getAmount(int K,int C)
{ System.out.println("Amount paid for travelling by Bus : "+(K*C)); } }
class Train implements Fare {
public void getAmount(int K,int C)
{ System.out.println("Amount paid for travelling by Train : "+(K*C)); } }
class amt5 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter No.of Kilometers travelled by bus : ");
int k=sc.nextInt();
System.out.print("Enter No.of Kilometers travelled byTrain : ");
int k1=sc.nextInt();
System.out.print("Enter fare for Kilometer travelled by bus : ");
int f=sc.nextInt();
System.out.print("Enter fare for Kilometer travelled byTrain : ");
int f1=sc.nextInt();
Fare b=new Bus();
Fare t=new Train();
b.getAmount(k,f);
b.getAmount(k1,f1);
}
}

