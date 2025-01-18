import java.util.Scanner;
 class un {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] un = new int[5];
        int count = 0;

        System.out.println("Enter 5 numbers between 10 and 100:");

        while (count < 5) {
            int num = s.nextInt();

            boolean isDuplicate = false;


            if (num >= 10 && num <= 100) {

                for (int i = 0; i < count; i++) {
                    if (un[i] == num) {
                        isDuplicate = true;
                        break;
                    }
                }


                if (!isDuplicate) {
                    un[count] = num;
                    count++;
                    System.out.print("Unique values: ");
                    for (int i = 0; i < count; i++) {
                        System.out.print(un[i] + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Duplicate number: " + num);
                }
            } else {
                System.out.println("Number must be between 10 and 100.");
            }
        }
    }
}
