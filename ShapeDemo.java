// Interface
interface Shape {
    double area();
}

// Circle class
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement area()
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement area()
    public double area() {
        return length * width;
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        // Hardcoded values
        Circle circle = new Circle(5.0); // radius = 5.0
        Rectangle rectangle = new Rectangle(4.0, 6.0); // length = 4.0, width = 6.0

        // Print areas
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
