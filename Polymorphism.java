/*Q: Create a class Vehicle with a method start(). Then create two subclasses Car and Bike that override the start() method to print different messages.

Use a Vehicle reference to point to both Car and Bike objects.

Call the start() method using that reference to demonstrate runtime polymorphism. */

class Vehical{
    void start(){
        System.out.println("Vehical is starting....");
    }
}
    class bike extends Vehical{
        @Override
        void start(){
            System.out.println("Bike is starting....");
        }
    } 

    class Car extends Vehical{
        @Override
        void start(){
            System.out.println("Car is starting...");
        }
    }

public class Polymorphism {
    public static void main(String[] args) {
        Vehical v=new Vehical();
        Vehical b=new Car();
        Vehical c=new bike();
        v.start();
        b.start();
        c.start();
    }
}
