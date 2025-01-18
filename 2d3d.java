import java.util.Scanner;

abstract class Shape {
    abstract double getArea();
    abstract double getVolume();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return side * side;
    }

    @Override
    double getVolume() {
        return 0; // Squares are 2D shapes, so volume is not applicable
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return 0; // Circles are 2D shapes, so volume is not applicable
    }
}

class Cube extends Shape {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double getArea() {
        return 6 * side * side;
    }

    @Override
    double getVolume() {
        return side * side * side;
    }
}

class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for Square
        System.out.print("Enter the side length for the Square: ");
        double sideSquare = sc.nextDouble();

        // Get user input for Circle
        System.out.print("Enter the radius for the Circle: ");
        double radiusCircle = sc.nextDouble();

        // Get user input for Cube
        System.out.print("Enter the side length for the Cube: ");
        double sideCube = sc.nextDouble();

        // Get user input for Sphere
        System.out.print("Enter the radius for the Sphere: ");
        double radiusSphere = sc.nextDouble();

        // Create instances of the shapes
        Square square = new Square(sideSquare);
        Circle circle = new Circle(radiusCircle);
        Cube cube = new Cube(sideCube);
        Sphere sphere = new Sphere(radiusSphere);

        // Display results
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Area of Circle: " + circle.getArea());
        System.out.println("Surface Area of Cube: " + cube.getArea());
        System.out.println("Volume of Cube: " + cube.getVolume());
        System.out.println("Surface Area of Sphere: " + sphere.getArea());
        System.out.println("Volume of Sphere: " + sphere.getVolume());
    }
}

