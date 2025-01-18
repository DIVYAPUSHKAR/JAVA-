package example;
interface Bank
{
    float getROI();
}
public class HDFC implements Bank
{
    public float getROI()
    {
        return 9.8f;
    }
}
