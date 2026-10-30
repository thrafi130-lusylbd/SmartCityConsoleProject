package weather;

import main.CityService;

public class WeatherMonitor extends CityService {

    public WeatherMonitor() {
        super("Weather Monitoring");
    }

    @Override
    public void runService() {
        heading();
        WeatherSensor[] sensors = { new TemperatureSensor(), new RainSensor(), new HumiditySensor() };
        for (WeatherSensor s : sensors) s.start();
        for (WeatherSensor s : sensors) {
            try {
                s.join(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Monitoring interrupted.");
                return;
            }
        }
        System.out.println("Weather report completed.");
    }
}
