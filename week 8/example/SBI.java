package example;
 interface Bank
{
    float getROI();
}
public class SBI implements Bank
{
    public float getROI()
    {
        return 8.7f;
    }
}
