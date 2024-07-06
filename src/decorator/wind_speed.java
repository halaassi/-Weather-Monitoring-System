package decorator;

import Observer.weather_observer;

public class wind_speed extends weather_decortor {
    private double wind;
    public wind_speed(weather_observer observer, double wind) {
        super(observer);
    this .wind=wind;
    }

    @Override
    public void update_weather(double temp, double hum) {
    observer.update_weather(temp, hum);


    }
    public void print() {
        System.out.println("wind speed"+wind +"km/h");

    }
}
