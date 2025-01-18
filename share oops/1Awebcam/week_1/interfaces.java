interface inter1
{
    int x=10;
    void meth1();
    void meth2();
    private  void  meth3()
    {
        System.out.println("meth 3 is called");
    }
    default void meth4()
    {
        meth3();
        System.out.println("meth4 is called");
    }
}
interface inter2 extends inter1
{
    void meth5();


}
class c1 implements inter2
{
   public void meth1()
   {
        System.out.println("methe 1 is overrided");
   }
   public void meth2()
   {
        System.out.println("methe 3 is overrided");
   }
   public void meth5()
   {
        System.out.println("methe 5 is overrided");
   }
}




public class Interfaces {
    public static void main(String args[])
    {
        c1 c= new c1();
        c.meth1();
        c.meth2();
        //c.meth3();// cannot called in main funtion because it is declared as private member of data
        c.meth4();
        c.meth5();

    }
    
}
