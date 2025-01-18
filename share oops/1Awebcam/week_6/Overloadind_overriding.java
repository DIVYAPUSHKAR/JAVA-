class array
{
    static void find_max(int[] arr)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println("maximum number of array = "+max);
    }
    static void find_max(String[] str)
    {
        String max= str[0];
        for(int i=0;i<str.length;i++)
        {
            if(max.compareTo(str[i])<0)
            {
                max=str[i];
            }
             
        }
        
        System.out.println("max string : "+max);
    }
    
}

class car
{
    void Accelerate()
    {
        System.out.println("car is accelerated");
    }
    void Break()
    {
        System.out.println("break is applied manually");
    }
}
class luxaryCar extends car
{
    void Accelerate()
    {
        System.out.println("acceleration is fully automated");
        super.Accelerate();
    }
    void Break()
    {
        System.out.println("break is applied automated ");
        super.Break();
    }
}
class Overloadind_overriding{
     public static void main(String args[])
    {
        int arr[]={34,65,38,19,23,66};
        String str[]={"raju","avinash","madhu","sai"};
        array.find_max(arr);
        array.find_max(str);
        luxaryCar car = new luxaryCar();
        car.Accelerate();
        car.Break();

    }
}
