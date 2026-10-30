package weather;

public abstract class WeatherSensor extends Thread {

    protected final String sensor;

    public WeatherSensor(String sensor) {
        this.sensor = sensor;
    }

    @Override
    public abstract void run();
}
