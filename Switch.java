/*Create a Fan Class

Define a class Fan with a private boolean variable isOn.

Implement methods turnOn(), turnOff(), and showStatus().

Create an object and test the methods. */

class Fan{

    private boolean isOn;

    void turnOn(){
        isOn=true;
    System.out.println("The fan is turned on.");
    }

    void turnOff(){
        isOn=false;
        System.out.println("The fan is turned off.");
    }

    void showStatus(){
        if(isOn){
            System.out.println("Fan is on.");
        }else{
            System.out.println("Fan is off.");
        }
    }


}
public class Switch {
    public static void main(String[] args) {
        Fan f=new Fan();
        f.showStatus();
        f.turnOff();
        f.turnOn();
        f.showStatus();
    }
}
