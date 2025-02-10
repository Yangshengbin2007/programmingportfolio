public class Box {
    private double width;
    private double height;
    private double breadth;

    // Constructor sets all values to 0
    public Box() {
        this.width = 0;
        this.height = 0;
        this.breadth = 0;
    }

    // Set methods
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    // Get Volume
    public double getVolume() {
        return width * height * breadth;
    }

    // Get Surface Area
    public double getSurfaceArea() {
        return 2 * (width * height + width * breadth + height * breadth);
    }
}