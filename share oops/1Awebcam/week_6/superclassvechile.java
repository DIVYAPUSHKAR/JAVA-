import java.util.Scanner;
class vehicle
{ int vehiclenum,insurancenum,fuel;
String color;
void info(int vehiclenum,int insurancenum,String color){
this.vehiclenum=vehiclenum;
this.insurancenum=insurancenum;
this.color=color; }
void getconsumption(int fuel)
{ this.fuel=fuel; }
void displayconsumption()
{ System.out.println("Consumption of fuel is "+fuel); }
void display()
{ System.out.println("Vehicle number is "+vehiclenum);
System.out.println("Insurance number is "+insurancenum);
System.out.println("Color of the vehicle is "+color); } }
class two_wheeler extends vehicle
{ double avg,maintenance;
double maintenance(double maintenance)
{ this.maintenance=maintenance;
return maintenance; }
double average(double avg)
{ this.avg=avg; return avg; } }
class four_wheeler extends vehicle
{ double avg,maintenance;
double maintenance(double maintenance)
{ this.maintenance=maintenance;
return maintenance; }
double average(double avg)
{ this.avg=avg; return avg; } }
class vehicle_details
{ public static void main(String args[])
{ Scanner sc=new Scanner(System.in);
System.out.println("Enter\n1 for Two-wheeler\n2 for Fourwheeler");
int op=sc.nextInt();
{ if(op==1)
{ System.out.println("Two-wheeler Details");
two_wheeler t1=new two_wheeler();
t1.info(294746137,1387496,"blue");
t1.getconsumption(10);
t1.displayconsumption();
t1.display();
double maintenance=t1.maintenance(56);
double avg=t1.average(1200);
System.out.println("For 2 wheeler maintenance is"+maintenance+"average is "+avg); }
else
{ System.out.println("Four wheeler Details");
four_wheeler f1=new four_wheeler();
f1.info(75420842,32457,"black");
f1.getconsumption(26);
f1.displayconsumption();
f1.display();
double maintenance=f1.maintenance(67);
double avg=f1.average(12000);
System.out.println("For 4 wheeler maintenance is "+maintenance+"average is "+avg); } } } }

