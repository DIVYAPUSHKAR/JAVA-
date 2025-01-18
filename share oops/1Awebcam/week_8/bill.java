package InterFace;
interface payBill
{
    void invoice();
}
public class bill implements payBill
{
    public float amt;
    public bill(float amt)
    {
        this.amt=amt;
    }
    public void invoice()
    {
        System.out.println("the bill amount is " + amt);

    }
    
}