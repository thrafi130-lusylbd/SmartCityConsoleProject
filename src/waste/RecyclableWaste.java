package waste;

public class RecyclableWaste extends Waste {

    public RecyclableWaste(double kg) {
        super("Recyclable", kg);
    }

    @Override
    public String process() {
        return "Sent to recycling centre.";
    }
}
