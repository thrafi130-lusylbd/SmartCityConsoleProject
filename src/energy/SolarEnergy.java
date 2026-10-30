package energy;

public class SolarEnergy extends EnergySource {

    public SolarEnergy(double units) {
        super(units);
    }

    @Override
    public String getSourceName() {
        return "Solar";
    }
}
