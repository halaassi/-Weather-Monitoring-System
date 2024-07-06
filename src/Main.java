import Observer.current_conditions;
import Observer.statistics;
import Subject.weather_subject;
import decorator.precipitation;
import decorator.temperature_units;
import decorator.wind_speed;

public class Main {
    public static void main(String[] args) {
        weather_subject subject = new weather_subject();
        current_conditions current_conditions = new current_conditions();
        statistics statistics = new statistics();


        subject .add_observer(current_conditions) ;
        subject.add_observer(statistics);

        subject.set_values(20,65);
        subject.set_values(24,50);
        subject.set_values(10,20);

        current_conditions.print();
        System.out.println(" tha average temperature and humidity:");

        statistics.print();


        temperature_units temperature_units = new temperature_units(current_conditions ,"C");
        wind_speed wind_speed = new wind_speed(temperature_units, 10);
        precipitation precipitation = new precipitation(wind_speed, "Rain");

        subject.add_observer(precipitation);


        temperature_units.print();
        wind_speed.print();
        precipitation.print();


    }
    }
