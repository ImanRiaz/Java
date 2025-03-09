class tempt{
    private double temperature;
        double value;

    void setCelsius(double value){
        temperature=value;
    }      

    void setFarenhite(double value){
        temperature=value;
    }

    void toFarenhite(){
        value=((value)*9/5)+32;
    }

    void toCelsius(){
        temperature=((temperature)*9/5)+32;
    }

    void showTemperature(){
        System.out.println("The celsius value is: "+value+" *C");
        System.out.println("The Fraenhite is "+temperature+" *F");
}
}
public class TempertaureConverter {
    public static void main(String [] args)
    {
        tempt t=new tempt();
        t.setCelsius(75.23);
        t.setFarenhite(75.23);
        t.toCelsius();
        t.toFarenhite();
    t.showTemperature();

    }
}
