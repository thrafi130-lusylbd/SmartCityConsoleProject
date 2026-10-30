package drone;

public class SurveillanceDrone extends Drone {

    public SurveillanceDrone(String id) {
        super(id);
    }

    @Override
    public String performTask() {
        return "Monitoring assigned area.";
    }
}

