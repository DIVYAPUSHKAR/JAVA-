abstract class Abstract 
{
    Abstract()
    {
        System.out.println("abstract class is called");
    }
    void math1()
    {
        System.out.println("meth 1 is called");

    }
    abstract void meth2();
    
    
}
 class sub extends Abstract
{
    sub()
    {
        System.out.println("sub class is called");
    }
    @Override
    void meth2()
    {
        System.out.println("meth 2 is called");
    }

}
 class test
{
    public static void main(String args[])
    {
       Abstract s1= new sub();
       s1.meth2(); 
    }
}