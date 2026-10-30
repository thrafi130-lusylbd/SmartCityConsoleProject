package emergency;

public class MedicalEmergency extends Emergency {

    public MedicalEmergency(String location) {
        super(location);
    }

    @Override
    public String response() {
        return "Ambulance dispatched";
    }
}
