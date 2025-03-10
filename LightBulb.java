class Bulb{
    private boolean isOn;


    void turnOn(){
        isOn=true;
            System.out.println("The Bulb is on.");
        
    }

    void turnOff(){
        isOn=false;
            System.out.println("The bulb is off.");
        }

        void showstatus(){
            if(isOn){
                System.out.println("On.");
            }else{
                System.out.println("off.");
            }
        }
    }


public class LightBulb {
    public static void main(String [] args){
        Bulb b=new Bulb();
        b.turnOn();
        b.turnOff();
        b.showstatus();
    }
}
