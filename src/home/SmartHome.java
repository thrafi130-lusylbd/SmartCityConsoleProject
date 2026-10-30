package home;

import java.util.Scanner;
import main.CityService;

public class SmartHome extends CityService {

    private final Scanner in = new Scanner(System.in);

    public SmartHome() {
        super("Smart Home Automation");
    }

    @Override
    public void runService() {
        heading();
        SmartDevice[] devices = { new SmartLight(), new SmartFan(), new SecurityCamera() };
        System.out.println("1. Turn all ON\n2. Turn all OFF\n3. Show status\n4. Anonymous control demo");
        System.out.print("Choose: ");
        try {
            int c = Integer.parseInt(in.nextLine());
            if (c == 1) {
                for (SmartDevice x : devices) x.turnOn();
                System.out.println("All devices ON.");
            } else if (c == 2) {
                for (SmartDevice x : devices) x.turnOff();
                System.out.println("All devices OFF.");
            } else if (c == 3) {
                for (SmartDevice x : devices) x.showStatus();
            } else if (c == 4) {
                new DeviceControl() {
                    public void turnOn()  { System.out.println("Anonymous object: light turned ON."); }
                    public void turnOff() { System.out.println("Anonymous object: light turned OFF."); }
                }.turnOn();
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number.");
        }
    }
}
