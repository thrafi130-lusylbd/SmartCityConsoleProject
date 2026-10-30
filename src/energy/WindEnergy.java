package energy;

public class WindEnergy extends EnergySource {

    public WindEnergy(double units) {
        super(units);
    }

    @Override
    public String getSourceName() {
        return "Wind";
    }
}
