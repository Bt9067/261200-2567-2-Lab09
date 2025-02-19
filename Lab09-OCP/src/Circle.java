public class Circle extends Shape {
    private final double radius; // Marked as private for encapsulation

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    @Override
    public double CalculateArea() {
        return 0;
    }
}