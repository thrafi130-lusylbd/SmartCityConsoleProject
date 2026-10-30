package home;

public class SmartLight extends SmartDevice {

    public SmartLight() {
        super("Smart Light");
    }

    @Override
    public void showStatus() {
        System.out.println(name + " is " + (isOn() ? "ON" : "OFF"));
    }
}
