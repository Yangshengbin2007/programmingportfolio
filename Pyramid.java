public class Pyramid {
    private double baseLength;
    private double baseWidth;
    private double height;

    // Constructor
    public Pyramid() {
        this.baseLength = 0;
        this.baseWidth = 0;
        this.height = 0;
    }

    // Set methods
    public void setBaseLength(double baseLength) {
        this.baseLength = baseLength;
    }

    public void setBaseWidth(double baseWidth) {
        this.baseWidth = baseWidth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Get Volume
    public double getVolume() {
        return (1.0 / 3.0) * baseLength * baseWidth * height;
    }

    // Get Surface Area (Approximate)
    public double getSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(baseLength / 2, 2));
        double baseArea = baseLength * baseWidth;
        double lateralArea = (baseLength * slantHeight + baseWidth * slantHeight) / 2;
        return baseArea + lateralArea;
    }
}