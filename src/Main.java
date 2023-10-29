public class Main {
    public static void main(String[] args) {
        //Observer:
        WeatherStation weatherStation = new WeatherStation();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        HumidityDisplay humidityDisplay = new HumidityDisplay();

        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(humidityDisplay);

        // Simulate temperature changes
        weatherStation.setTemperature(25.5); // This will trigger updates in both displays.
        System.out.println(weatherStation.getTemperature());
        weatherStation.setTemperature(30.0); // Another update.
        System.out.println(weatherStation.getTemperature());

        // Unregister the humidity display
        weatherStation.deleteObserver(humidityDisplay);

        weatherStation.setTemperature(27.5); // Only the temperature display is updated now.

        System.out.println(weatherStation.getTemperature());
        //Factory:
        SensorFactory sensorFactory = new SensorFactory();
        Sensor temperatureSensor = sensorFactory.createSensor("temperature");
        Sensor humiditySensor = sensorFactory.createSensor("humidity");

        temperatureSensor.readData();
        humiditySensor.readData();
    }
}