import java.util.Scanner;

 class CircleCalculator {


    public static void calculateAndPrintArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }


    public static void calculateAndPrintPerimeter(double radius) {
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Perimeter of the circle: " + perimeter);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();


        calculateAndPrintArea(radius);
        calculateAndPrintPerimeter(radius);

       
    }
}

