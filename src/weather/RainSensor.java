package weather;

public class RainSensor extends WeatherSensor {

    public RainSensor() {
        super("Rain sensor");
    }

    @Override
    public void run() {
        System.out.println(sensor + ": Light rain");
    }
}
