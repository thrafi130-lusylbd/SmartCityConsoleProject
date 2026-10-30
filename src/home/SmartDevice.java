package home;

public abstract class SmartDevice implements DeviceControl {

    protected String name;
    private boolean on;

    public SmartDevice(String name) {
        this.name = name;
        this.on = false;
    }

    public boolean isOn() {
        return on;
    }

    public abstract void showStatus();

    @Override
    public void turnOn() {
        this.on = true;
    }

    @Override
    public void turnOff() {
        this.on = false;
    }
}
