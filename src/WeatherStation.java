import java.util.Observable;


public class WeatherStation extends Observable {
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
