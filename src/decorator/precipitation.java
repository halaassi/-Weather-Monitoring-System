package decorator;
import Observer.weather_observer;
public class precipitation extends weather_decortor {
    private String precip;
    public precipitation(weather_observer weather_observer , String precip) {
        super(weather_observer);
        this.precip  = precip;

    }
    @Override
    public void update_weather(double temp, double hum) {
       super.update_weather(temp, hum);
        System.out.println("Precipitation: " + precip);

    }
    public void print() {
        System.out.println("Precipitation: " + precip);
    }
}
