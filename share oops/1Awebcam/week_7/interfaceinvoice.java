import java.util.Scanner;
interface payable { void getAmount(int m,int n); }class cal implements payable {
public void getAmount(int m,int n)
{ System.out.println("Amount paid to employee : "+(m*100));
System.out.println("Invoice or bill :"+ m*(100)+n);}}
class int3 {
public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter Amount : ");
int a=sc.nextInt();
System.out.print("Enter Extra Charges : ");
int b=sc.nextInt();
payable pb=new cal();
pb.getAmount(a,b);
}
}
