package decorator;

import Observer.weather_observer;

public class temperature_units extends weather_decortor {
    private String unit = "C";


    public temperature_units(weather_observer weather_observer, String unit) {
        super(weather_observer);
        this.unit = unit;
    }

    @Override
    public void update_weather(double temp, double hum) {
        double t = temp;
        if (unit.equals("F")) {
            t = (temp * 9 / 5) + 32;
            observer.update_weather(temp, hum);

        }
    }
    public void print() {

        System.out.println("Temperature unit: " + unit);



    }

}



