class tempt{
    private double temperature;
        

   tempt(double value){
        this.temperature=value;
    }      

    void setFarenhite(){
       temperature = (temperature - 32) * 5 / 9;
    }

    double toFarenhite(){
      return  temperature=((temperature)*9/5)+32;
    }

    double toCelsius(){
       return temperature=((temperature)*9/5)+32;
    }

    void showTemperature(){
        System.out.println("The celsius value is: "+ toCelsius() +" *C");
        System.out.println("The Fraenhite is "+toFarenhite()+" *F");
}
}
public class TempertaureConverter {
    public static void main(String [] args)
    {
        tempt t=new tempt(25);
    t.showTemperature();

    }
}
