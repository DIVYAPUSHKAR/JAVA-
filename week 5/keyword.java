import java.util.Scanner;

class keyword {
    private int x;

    public keyword(int x) {
        this.x = x; 
    }

    void printa() {
        System.out.println("Value of x: " + this.x); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for x: ");
        int b = scanner.nextInt();

        keyword obj = new keyword (b);
        obj.printa();

        
    }
}

