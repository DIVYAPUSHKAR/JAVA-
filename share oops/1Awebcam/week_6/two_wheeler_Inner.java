import java.util.Scanner;

class two_wheeler
{
    String name;
    String type;

    two_wheeler(String name,String type)
    {
        this.name=name;
        this.type=type;
    }
    void getName()
    {
        System.out.println("name  of two wheeler : "+name);
    }
    void getType()
    {
        System.out.println("type of two wheeler is "+type);
    }
    class geared
    {
        float avg;
        geared(float avg )
        {
            this.avg=avg;
        }
        void getAverage()
        {
            System.out.println("average of geared two wheeler is :"+avg);
        }
    }
    class non_geared
    {
        float avg;
        non_geared(float avg )
        {
            this.avg=avg;
        }
        void getAverage()
        {
            System.out.println("average of geared two wheeler is :"+avg);
        }
        
    }

}










public class two_wheeler_Inner {
    public static void main(String args[])
    {
        String name;
        String type;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the name of campany : ");
        name=sc.nextLine();
        System.out.println("enter the type  of engine : ");
        type=sc.nextLine();

        two_wheeler w1= new two_wheeler(name,"type");
        two_wheeler.geared g1=w1.new geared(220);
        w1.getName();
        w1.getType();
        g1.getAverage();



        String Name;
        String Type;
        
        System.out.println("enter the name of campany : ");
        Name=sc.nextLine();
        System.out.println("enter the type  of engine : ");
        Type=sc.nextLine();

        two_wheeler w2= new two_wheeler(Name,Type);
        two_wheeler.non_geared g2=w2.new non_geared(240);
        w1.getName();
        w1.getType();
        g2.getAverage();


        sc.close();


    }

    
}
