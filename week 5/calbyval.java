import java.util.Scanner;

public class calbyval {


    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " (call by value): " + sum);

        
    }
}

