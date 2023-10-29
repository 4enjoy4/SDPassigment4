import java.util.Observable;
import java.util.Observer;

public class HumidityDisplay implements Display, Observer {
    @Override
    public void update(Observable observable, Object data) {
        if (observable instanceof WeatherData) {
            double humidity = Math.random() * 100;
            System.out.println("Humidity Display: " + humidity + "%");
        }
    }
}
