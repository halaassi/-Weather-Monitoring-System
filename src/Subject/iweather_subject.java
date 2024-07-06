package Subject;

import Observer.weather_observer;

public interface iweather_subject {
    public void add_observer(weather_observer observer);
    public void remove_observer(weather_observer observer);
    public void notify_observers();

}
