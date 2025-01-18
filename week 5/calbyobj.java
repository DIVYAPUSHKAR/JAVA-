import java.util.Scanner;

class example {
    int sum; 


    public void addNumbers(int a, int b) {
        sum = a + b;
    }
}

public class calbyobj {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        example obj= new example();

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();


        obj.addNumbers(num1, num2);


        System.out.println("Sum of " + num1 + " and " + num2 + " (call by object): " + obj.sum);

        
    }
}

