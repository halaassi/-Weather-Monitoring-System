package Observer;

public class current_conditions implements weather_observer {
    private    double temp ;
    private double hum ;


    @Override
    public void update_weather(double temp, double hum) {
    this .temp = temp;
    this.hum = hum;
    //print();
    }



    public void print() {
        System.out.println("Current conditions: " + temp + " C degrees and " + hum + " % humidity");
    }


}
