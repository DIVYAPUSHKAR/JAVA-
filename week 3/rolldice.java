import java.util.Random;
import java.util.Scanner;

public class rolldice {
    public static void main(String[] args) {
        // Initialize random number generator
        Random random = new Random();

        // Counter for successful attempts
        int successfulAttempts = 0;

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of dice rolls
        System.out.print("Enter the number of dice rolls: ");
        int numRolls = scanner.nextInt();

        // Simulate rolling a pair of dice specified number of times
        for (int i = 1; i <= numRolls; i++) {
            // Roll the dice
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            // Display the result
            System.out.println("Roll " + i + ": Dice 1 = " + dice1 + ", Dice 2 = " + dice2);

            // Check for a successful attempt
            if (dice1 == dice2) {
                System.out.println("   Successful attempt!");
                successfulAttempts++;
            }

            // Delay for 1000 ms (1 second)
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Display the total number of successful attempts
        System.out.println("\nTotal Successful Attempts: " + successfulAttempts);

        
    }
}

