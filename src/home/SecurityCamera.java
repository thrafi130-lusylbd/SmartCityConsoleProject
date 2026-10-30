package home;

public class SecurityCamera extends SmartDevice {

    public SecurityCamera() {
        super("Security Camera");
    }

    @Override
    public void showStatus() {
        System.out.println(name + " is " + (isOn() ? "RECORDING" : "OFF"));
    }
}
