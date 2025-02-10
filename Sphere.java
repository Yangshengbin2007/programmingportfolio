public class Sphere {
    private double radius;

    // Constructor
    public Sphere() {
        this.radius = 0;
    }

    // Set method
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Get Volume
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Get Surface Area
    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}