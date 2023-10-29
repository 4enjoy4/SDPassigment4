public class SensorFactory {
    public Sensor createSensor(String sensorType) {
        if (sensorType.equalsIgnoreCase("temperature")) {
            return new TemperatureSensor();
        } else if (sensorType.equalsIgnoreCase("humidity")) {
            return new HumiditySensor();
        } else {
            throw new IllegalArgumentException("Invalid sensor type");
        }
    }
}
