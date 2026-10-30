package drone;

import main.CityService;

public class DroneManager extends CityService {

    public DroneManager() {
        super("Drone Fleet Management");
    }

    @Override
    public void runService() {
        heading();
        Drone[] fleet = {
            new DeliveryDrone("DR-101"),
            new SurveillanceDrone("DR-102"),
            new EmergencyDrone("DR-103")
        };
        for (Drone d : fleet) d.start();
        for (Drone d : fleet) {
            try {
                d.join(1700);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
        System.out.println("Fleet check completed.");
    }
}
