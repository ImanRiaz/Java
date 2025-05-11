/*Create an interface Shape with a method double area();.
Implement this interface in two classes:
•	Circle (with radius)
•	Rectangle (with length and width)
Use the main() method to take input and print area for both shapes.
*/

interface Shape{
    double area();
}

class Circle implements Shape{
    private double radius;

    public Circle(double r){
        this.radius=r;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}

class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle (double l,double w){
        this.length=l;
        this.width=w;
    }

    public double area(){
        return length*width;
    }
}

public class ShapeDemo{
    public static void main(String[] args) {
        Circle c=new Circle(5.0);
        Rectangle r=new Rectangle(5.0,6.0);

        System.out.println("Area of Circle: "+ c.area());
        System.out.println("Area of Rectangle: "+ r.area());
    }
}