import java.util.*;
class Vehcile
{
    int insuranceno;
    String vehicleno;
    String color;
    double nolit,price;
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
    String getType(int n)
    {
        if(n==1)
        {
          return "geared";
        }
        else
        {
            return "non_geared";
        }

    }
    String getName(String cn)
    {
        return cn;
    }
}
class Geared extends twoWheeler
{
    void average()
    {
        System.out.println("Average speed for geared:15km per hour");
    }
}
class nonGeared extends twoWheeler
{
    void Average()
    {
        System.out.println("Average speed for nongeared:10km per hour");
    }
}
class geared
{
    public static void main(String...args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("TWO WHEELER");
        twoWheeler  t=new twoWheeler();
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
        System.out.println("enter the companyname:");
        String cn=sc.nextLine();
        t.setInsuranceno(I);
        t.setVehicleno(v);
        t.setColor(c);
        t.setConsumption(nolit,price);
        System.out.println("Insurance.no:"+t.getInsuranceno());
        System.out.println("vehcle.no:"+t.getVehicleno());
        System.out.println("color:"+t.getColor());
        System.out.println("consumption:"+t.getConsumption());
        System.out.println("enter n value:");
        int n=sc.nextInt();
        System.out.println("type of bike:"+t.getType(n));
        System.out.println("name of the comapany:"+t.getName(cn));
        Geared g=new Geared();
        g.average();
        nonGeared G=new nonGeared();
        G.Average();
    }
}
