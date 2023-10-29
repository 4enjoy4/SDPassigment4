import java.util.Observable;
import java.util.Observer;
public class WeatherData extends Observable{
    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        setChanged();
        notifyObservers(temperature);
    }

    public double getTemperature() {
        return temperature;
    }
}
