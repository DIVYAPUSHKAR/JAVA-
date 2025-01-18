import java.util.*;
class Vehcile
{
    int insuranceno;
    String vehicleno;
    String color;
    double nolit,price;
    double add_charges;
    void setInsuranceno(int insuranceno)
    {
        this.insuranceno=insuranceno;
    }
    void setVehicleno(String vehicleno)
    {
        this.vehicleno=vehicleno;
    }
    void setColor(String color)
    {
        this.color=color;
    }
    void setAddcharges(double add_charges)
    {
    this.add_charges=add_charges;
    }
    double getAddcharges()
    {
    return add_charges;
    }
    int getInsuranceno()
    {
        return insuranceno;
    }
    String getVehicleno()
    {
        return vehicleno;
    }
    String getColor()
    {
        return color;
    }
    void setConsumption(double nolit,double price)
    {
    this.nolit=nolit;
    this.price=price;
    }
    double getConsumption()
    {
        return nolit*price;
    }
}
class twoWheeler extends Vehcile
{
    double maintainance()
    {
        return ((getConsumption())+(getAddcharges()));
    }
    void Average()
    {
        System.out.println("its average speed is:5km per hour");
    }
}
class fourWheeler extends Vehcile
{
    double maintainance()
    {
        return ((getConsumption())+(getAddcharges()));
    }
    void Average()
    {
        System.out.println("it's average speed is:10km per hour");
    }
}
class Maintainance
{
    public static void main(String...args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("TWO WHEELER");
        twoWheeler t=new twoWheeler();
        System.out.println("enter the insurance number:");
        int I=sc.nextInt();
        System.out.println("enter the vehcile number:");
        String v=sc.next();
        System.out.println("enter the color of the vehcile");
        String c=sc.next();
        System.out.println("enter the no.of liters fuel:");
        double nolit=sc.nextDouble();
        System.out.println("enter the price per liter:");
        double price=sc.nextDouble();
        System.out.println("enter the additional charges:");
        double add_charges=sc.nextDouble();
        t.setInsuranceno(I);
        t.setVehicleno(v);
        t.setColor(c);
        t.setConsumption(nolit,price);
        t.setAddcharges(add_charges);
        System.out.println("Insurance.no:"+t.getInsuranceno());
        System.out.println("vehcle.no:"+t.getVehicleno());
        System.out.println("color:"+t.getColor());
        System.out.println("consumption:"+t.getConsumption());
        System.out.println("maintainance:"+t.maintainance());
        t.Average();

        System.out.println("FOUR WHEELER");
        fourWheeler f=new fourWheeler();
        System.out.println("enter the insurance number:");
        int i=sc.nextInt();
        System.out.println("enter the vehcile number:");
        String V=sc.next();
        System.out.println("enter the color of the vehcile");
        String C=sc.next();
        System.out.println("enter the no.of liters fuel:");
        double Nolit=sc.nextDouble();
        System.out.println("enter the price per liter:");
        double Price=sc.nextDouble();
        System.out.println("enter the additional charges:");
        double Add_charges=sc.nextDouble();
        f.setInsuranceno(i);
        f.setVehicleno(V);
        f.setColor(C);
        f.setConsumption(Nolit,Price);
        f.setAddcharges(Add_charges);
        System.out.println("Insurance.no:"+f.getInsuranceno());
        System.out.println("vehcle.no:"+f.getVehicleno());
        System.out.println("color:"+f.getColor());
        System.out.println("consumption:"+f.getConsumption());
        System.out.println("maintainance:"+f.maintainance());
        f.Average();
    }
}
