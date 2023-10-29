import java.util.Observable;
import java.util.Observer;

public class TemperatureDisplay implements Display, Observer {
    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof WeatherData) {
            double temperature = (Double) data;
            System.out.println("Temperature Display: " + temperature + " degrees Celsius");
        }
    }
}
