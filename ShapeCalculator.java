import java.util.Scanner;


abstract class Shape3D {
    abstract double calcSA(); // Method to calculate surface area
    abstract double calcVol(); // Method to calculate volume
}


class Cube extends Shape3D {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    double calcSA() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    double calcVol() {
        return Math.pow(side, 3);
    }
}

// Sphere class
class Sphere extends Shape3D {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calcSA() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    double calcVol() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}

// Cylinder class
class Cylinder extends Shape3D {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calcSA() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double calcVol() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

// Cone class
class Cone extends Shape3D {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calcSA() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double calcVol() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Choose a shape to calculate:");
            System.out.println("1. Cube");
            System.out.println("2. Sphere");
            System.out.println("3. Cylinder");
            System.out.println("4. Cone");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            Shape3D shape = null;

            switch (choice) {
                case 1:
                    System.out.print("Enter side length of the cube: ");
                    double side = scanner.nextDouble();
                    shape = new Cube(side);
                    break;
                case 2:
                    System.out.print("Enter radius of the sphere: ");
                    double radius = scanner.nextDouble();
                    shape = new Sphere(radius);
                    break;
                case 3:
                    System.out.print("Enter radius of the cylinder: ");
                    double cylRadius = scanner.nextDouble();
                    System.out.print("Enter height of the cylinder: ");
                    double cylHeight = scanner.nextDouble();
                    shape = new Cylinder(cylRadius, cylHeight);
                    break;
                case 4:
                    System.out.print("Enter radius of the cone: ");
                    double coneRadius = scanner.nextDouble();
                    System.out.print("Enter height of the cone: ");
                    double coneHeight = scanner.nextDouble();
                    shape = new Cone(coneRadius, coneHeight);
                    break;
                case 5:
                    running = false;
                    continue;
                default:
                    System.out.println("Invalid choice, please try again.");
                    continue;
            }

            if (shape != null) {
                System.out.println("Surface Area: " + shape.calcSA());
                System.out.println("Volume: " + shape.calcVol());
            }
        }

        scanner.close();
        System.out.println("Goodbye!");
    }
}