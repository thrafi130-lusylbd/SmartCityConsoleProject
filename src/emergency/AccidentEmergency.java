package emergency;

public class AccidentEmergency extends Emergency {

    public AccidentEmergency(String location) {
        super(location);
    }

    @Override
    public String response() {
        return "Police and rescue team dispatched";
    }
}
