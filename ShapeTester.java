import java.util.Scanner;

public class ShapeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Shape Maker! Let's find the volume and surface area for a few shapes...");
        System.out.println("To build a Box, press 1\nTo build a Sphere, press 2\nTo build a Pyramid, press 3");
        int choice = scanner.nextInt();

        if (choice == 1) {
            Box box = new Box();
            System.out.print("Please enter the width of the box: ");
            box.setWidth(scanner.nextDouble());

            System.out.print("Please enter the height of the box: ");
            box.setHeight(scanner.nextDouble());

            System.out.print("Please enter the breadth of the box: ");
            box.setBreadth(scanner.nextDouble());

            System.out.println("The volume for your box: " + box.getVolume());
            System.out.println("The surface area for your box: " + box.getSurfaceArea());

        } else if (choice == 2) {
            Sphere sphere = new Sphere();
            System.out.print("Please enter the radius of the sphere: ");
            sphere.setRadius(scanner.nextDouble());

            System.out.println("The volume for your sphere: " + sphere.getVolume());
            System.out.println("The surface area for your sphere: " + sphere.getSurfaceArea());

        } else if (choice == 3) {
            Pyramid pyramid = new Pyramid();
            System.out.print("Please enter the base length of the pyramid: ");
            pyramid.setBaseLength(scanner.nextDouble());

            System.out.print("Please enter the base width of the pyramid: ");
            pyramid.setBaseWidth(scanner.nextDouble());

            System.out.print("Please enter the height of the pyramid: ");
            pyramid.setHeight(scanner.nextDouble());

            System.out.println("The volume for your pyramid: " + pyramid.getVolume());
            System.out.println("The surface area for your pyramid: " + pyramid.getSurfaceArea());

        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }

        scanner.close();
    }
}