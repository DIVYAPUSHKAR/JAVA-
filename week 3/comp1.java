import java.util.Random;

public class diceroll {
    public static void main(String[] args) {
        
        Random random = new Random();

        
        int successfulAttempts = 0;

        
        for (int i = 1; i <= 10; i++) {
            // Roll the dice
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            // Display the result
            System.out.println("Attempt " + i + ": Dice 1 = " + dice1 + ", Dice 2 = " + dice2);

            
            if (dice1 == dice2) {
                System.out.println("   Successful attempt!");
                successfulAttempts++;
            }

           
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
        System.out.println("\nTotal Successful Attempts: " + successfulAttempts);
    }
}

