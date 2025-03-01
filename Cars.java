class Car{
    String brand;
    int year;
    void displaydetails(){
        System.out.println("The name of the brand is :"+brand);
        System.out.println("The year it was lauched in is :"+year);
    }

}
public class Cars {
    public static void main(){
        Car c=new Car();
        c.brand="Mercedes";
        c.year=1912;
        c.displaydetails();
    }
}
