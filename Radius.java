/*Create a Circle Class

Define a class Circle with an attribute radius.

Implement a method calculateArea() that returns the area (π * r²).

Create an object, set a radius, and print the area. */

class Circle{
    double calculateArea(double radius){
        final double pie=3.144;
        double ans=pie*radius*radius;
        return ans;

    }
}
public class Radius {
    public static void main(String [] args){
        Circle c=new Circle();
        System.out.println("The area is "+c.calculateArea(8.231));
    }
    
}
