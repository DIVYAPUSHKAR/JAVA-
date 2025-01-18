class call_by_value_object
{
    int a,b;
    call_by_value_object(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    public  void cal_by_value(int a,int b)
    {
        int t=a;
        a=b;
        b=t;  
       
        
    }
    public  void call_by_object(call_by_value_object o)
    {
        int t=o.a;
        o.a=o.b;
        o.b=t;
    }
}


public class call_by_val_object 
{
    public static void main(String args[])
    {
        
        call_by_value_object s= new call_by_value_object(12,24);
        System.out.println("before calling --> a = "+s.a+"  b = "+s.b);
        s.cal_by_value(12,24);
        System.out.println("after call by value -->a = "+s.a+"  b = "+s.b);
        s.call_by_object(s);
        System.out.println("after call by object --> a = "+s.a+"  b = "+s.b);
    }
    
}
