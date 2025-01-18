import java.util.Scanner;

interface Vehicle {
    String getColor();
    String getNumber();
    double getConsumption();
}

class TwoWheeler implements Vehicle {
    private String color;
    private String number;
    private double fuelConsumption;

    public TwoWheeler(String color, String number, double fuelConsumption) {
        this.color = color;
        this.number = number;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public double getConsumption() {
        return fuelConsumption;
    }
}

class FourWheeler implements Vehicle {
    private String color;
    private String number;
    private double fuelConsumption;

    public FourWheeler(String color, String number, double fuelConsumption) {
        this.color = color;
        this.number = number;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public double getConsumption() {
        return fuelConsumption;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for TwoWheeler
        System.out.print("Enter color for Two Wheeler: ");
        String colorTwoWheeler = scanner.nextLine();
        System.out.print("Enter registration number for Two Wheeler: ");
        String numberTwoWheeler = scanner.nextLine();
        System.out.print("Enter fuel consumption for Two Wheeler: ");
        double consumptionTwoWheeler = scanner.nextDouble();

        // Create an instance of TwoWheeler
        TwoWheeler twoWheeler = new TwoWheeler(colorTwoWheeler, numberTwoWheeler, consumptionTwoWheeler);

        // Get user input for FourWheeler
        System.out.print("Enter color for Four Wheeler: ");
        String colorFourWheeler = scanner.nextLine(); // consume the newline character
        colorFourWheeler = scanner.nextLine(); // read the color
        System.out.print("Enter registration number for Four Wheeler: ");
        String numberFourWheeler = scanner.nextLine();
        System.out.print("Enter fuel consumption for Four Wheeler: ");
        double consumptionFourWheeler = scanner.nextDouble();

        // Create an instance of FourWheeler
        FourWheeler fourWheeler = new FourWheeler(colorFourWheeler, numberFourWheeler, consumptionFourWheeler);

        // Display results
        System.out.println("Details for Two Wheeler:");
        System.out.println("Color: " + twoWheeler.getColor());
        System.out.println("Number: " + twoWheeler.getNumber());
        System.out.println("Fuel Consumption: " + twoWheeler.getConsumption());

        System.out.println("\nDetails for Four Wheeler:");
        System.out.println("Color: " + fourWheeler.getColor());
        System.out.println("Number: " + fourWheeler.getNumber());
        System.out.println("Fuel Consumption: " + fourWheeler.getConsumption());
    }
}

