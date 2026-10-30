package drone;

public class DeliveryDrone extends Drone {

    public DeliveryDrone(String id) {
        super(id);
    }

    @Override
    public String performTask() {
        return "Delivering a medicine package.";
    }
}
