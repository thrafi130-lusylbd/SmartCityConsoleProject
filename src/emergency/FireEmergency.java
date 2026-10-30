package emergency;

public class FireEmergency extends Emergency {

    public FireEmergency(String location) {
        super(location);
    }

    @Override
    public String response() {
        return "Fire service dispatched";
    }
}
