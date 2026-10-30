package weather;

public class HumiditySensor extends WeatherSensor {

    public HumiditySensor() {
        super("Humidity sensor");
    }

    @Override
    public void run() {
        System.out.println(sensor + ": 72%");
    }
}
