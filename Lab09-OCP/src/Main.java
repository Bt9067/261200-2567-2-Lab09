public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(5.0,6.0);
        Ellipse ellipse = new Ellipse(2.0,3.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Rectangle Area: " + rectangle.CalculateArea());
        System.out.println("Ellipse Area: " + ellipse.CalculateArea());
    }
}
