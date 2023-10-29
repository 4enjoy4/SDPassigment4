//Create Concrete Sensor implementations
public class TemperatureSensor implements Sensor{
    @Override
    public void readData() {
        System.out.println("Reading temperature data...");
    }
}
