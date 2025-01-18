
import java.util.Scanner;
interface Vehicle 
{
void getColor(String c);
void getNumber(int n);
void getConsumption(int l,int fuelcost); 
}
class TwoWheeler implements Vehicle 
{
public void getColor(String c) 
{
System.out.println("Color of the TwoWheeler is:"+c);
 }
public void getNumber(int n)
 {
System.out.println("Number of theTwoWheeler is:"+n); 
}
public void getConsumption(int l,int fuelcost) {System.out.println("Consumption of TwoWheeler is:"+(l*fuelcost)); } }
class FourWheeler implements Vehicle 
{
public void getColor(String c) 
{
System.out.println("Color of the FourWheeler is:"+c); 
}
public void getNumber(int n) 
{
System.out.println("Number of theFourWheeler is:"+n);
 }
public void getConsumption(int l,int fuelcost) 
{
System.out.println("Consumption of FourWheeler is:"+(l*fuelcost)); 
} 
}
class intv4 
{ 
public static void main(String args[])
{ 
Scanner sc=new Scanner(System.in);
System.out.println("Enter Thecolor of TwoWheeler:"); String
C=sc.nextLine();
System.out.println("Enter Number of TwoWheeler:");
int N=sc.nextInt();
System.out.println("Enter Number of Litres of Fuel Consumedby TwoWheeler:");
int L=sc.nextInt();
System.out.println("Enter the cost of Fuel per litre Consumedby TwoWheeler:");
int FC=sc.nextInt();
System.out.println("Enter The color of Four Wheeler:");
String C1=sc.next();
System.out.println("Enter Number of Four Wheeler:");
int N1=sc.nextInt();
System.out.println("Enter Number of Litres of Fuel Consumed by Four Wheeler:");
int L1=sc.nextInt();
System.out.println("Enter the cost of Fuel per litre Consumed by fourWheeler:");
int FC1=sc.nextInt();
Vehicle TW=new TwoWheeler();
Vehicle FW=new FourWheeler();
System.out.println("Details of two wheeler");
TW.getColor(C);
TW.getNumber(N);
TW.getConsumption(L,FC);
System.out.println("Details of four wheeler");
FW.getColor(C1);
FW.getNumber(N1);
FW.getConsumption(L1,FC1);
}
}
