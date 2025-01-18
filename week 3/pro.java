import java.util.Scanner;

class mailorderhouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalRetailValue = 0.0;

        while (true) {

            System.out.print("Enter product ID (1-5) or -1 to exit: ");
            int productId = sc.nextInt();


            if (productId == -1) {
                break;
            }

            System.out.print("Enter quantity sold: ");
            int quantitySold = sc.nextInt();


            double retailPrice = 0.0;
            switch (productId) {
                case 1:
                    retailPrice = 99.90;
                    break;
                case 2:
                    retailPrice = 20.20;
                    break;
                case 3:
                    retailPrice = 6.87;
                    break;
                case 4:
                    retailPrice = 45.50;
                    break;
                case 5:
                    retailPrice = 40.49;
                    break;
                default:
                    System.out.println("Invalid product ID. Please enter a number between 1 and 5.");
                    continue; 
            }


            totalRetailValue += retailPrice * quantitySold;
        }


        System.out.println("Total Retail Value: Rs. " + totalRetailValue);
    }
}

