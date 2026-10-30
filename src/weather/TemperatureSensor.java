package weather;

public class TemperatureSensor extends WeatherSensor {

    public TemperatureSensor() {
        super("Temperature sensor");
    }

    @Override
    public void run() {
        System.out.println(sensor + ": 29 C");
    }
}
