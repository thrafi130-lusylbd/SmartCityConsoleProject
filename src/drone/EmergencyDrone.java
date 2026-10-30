package drone;

public class EmergencyDrone extends Drone {

    public EmergencyDrone(String id) {
        super(id);
    }

    @Override
    public String performTask() {
        return "Searching emergency location.";
    }
}
