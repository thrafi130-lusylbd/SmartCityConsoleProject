package home;

public class SmartFan extends SmartDevice {

    private int speed = 1;

    public SmartFan() {
        super("Smart Fan");
    }

    public void setSpeed(int speed) {
        if (speed >= 1 && speed <= 5) this.speed = speed;
    }

    @Override
    public void showStatus() {
        System.out.println(name + " is " + (isOn() ? "ON" : "OFF") + ", speed " + speed);
    }
}
