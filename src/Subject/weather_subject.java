package Subject;

import Observer.weather_observer;

import java.util.ArrayList;

public class weather_subject implements iweather_subject {
    private ArrayList<weather_observer> observers  ;
    private  double temp ;
    private double hum;

public weather_subject(){
    observers=new ArrayList<>();
}
    @Override
    public void add_observer(weather_observer observer) {observers.add(observer);}
    @Override
    public void remove_observer(weather_observer observer) {observers.remove(observer);}

    @Override
    public void notify_observers() {
    for (weather_observer observer : this.observers) {
        observer.update_weather(this.temp,this .hum);
    }
    }

    public void set_values(double temp, double hum) {
        this.temp = temp;
        this.hum = hum;
        notify_observers();
    }
}