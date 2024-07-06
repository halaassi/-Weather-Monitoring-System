package Observer;

import java.util.ArrayList;

public class statistics implements weather_observer {
    private ArrayList<Double> temp_list = new ArrayList<>();
    private ArrayList<Double> hum_list = new ArrayList<>();

        @Override
    public void update_weather(double temp, double hum) {
            temp_list.add(temp);
            hum_list.add(hum);
            //print();
    }
    private double avg(ArrayList<Double> list) {
        double sum = 0;
        for (double f : list) {
            sum += f;
        }
        return sum / list.size();
    }

    public void print() {
        Double temp_avg = avg(temp_list);
        Double hum_avg = avg(hum_list);
        System.out.println("Average temperature: " + temp_avg + " C degrees");
        System.out.println("Average humidity: " + hum_avg + "%");

    }
}
