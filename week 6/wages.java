import java.util.*;
class contractEmp
{ 
    String getDesign(String design)
    {
        return design;
    }
}
class weeklyEmp extends contractEmp
{
    String getDesign(String design)
    {
        return design;
    }
    void caluculateWages(int nw,int wage_per_week)
    {
        System.out.println("total wages:"+nw*wage_per_week);
    }
}
class hourlyEmp extends contractEmp
{
    String getDesign(String desig)
    {
        return desig;
    }
    void caluculatewages(int nh,int wage_per_hour)
    {
        System.out.println("total wages:"+nh*wage_per_hour);
    }
}
class wages
{
    public static void main(String...args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("WEEKLY EMPLOYEE DETAILS");
        weeklyEmp w=new weeklyEmp();
        System.out.println("enter the designation:");
        String design=sc.next();
        System.out.println("enter the number of weeks:");
        int nw=sc.nextInt();
        System.out.println("enter wages per week: ");
        int wages_per_week=sc.nextInt();
        System.out.println("designation:"+w.getDesign(design));
        w.caluculateWages(nw, wages_per_week);

        System.out.println("HOURLY EMPLOYEE DETAILS");
        hourlyEmp h=new hourlyEmp();
        System.out.println("enter the designation:");
        String desig=sc.next();
        System.out.println("enter the number of weeks:");
        int nh=sc.nextInt();
        System.out.println("enter wages per week: ");
        int wages_per_hour=sc.nextInt();
        System.out.println("designation:"+h.getDesign(desig));
        w.caluculateWages(nh, wages_per_hour); 
    }
}
