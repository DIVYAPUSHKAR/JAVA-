import calculator.adder;
import calculator.substract;
import calculator.multiplier;
import calculator.division;

class question4
{
    public static void main(String args[])
    {
        adder a= new adder(12,9);
        a.add();
        substract s= new substract(32,12);
        s.diff();
        multiplier m= new multiplier(12,6);
        m.prod();
        division d= new division(49,7);
        d.questient();
    }
}