package waste;

public class OrganicWaste extends Waste {

    public OrganicWaste(double kg) {
        super("Organic", kg);
    }

    @Override
    public String process() {
        return "Sent for composting.";
    }
}
