package decorator;

import Observer.weather_observer;

public abstract class weather_decortor implements weather_observer {
    protected weather_observer observer;

    public weather_decortor(weather_observer weather_observer) {
        this.observer = weather_observer;
    }
@Override
    public void update_weather(double temp, double hum) {
    observer.update_weather(temp, hum);
    }
}
