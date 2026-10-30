package energy;

public abstract class EnergySource {

    private double units;

    public EnergySource(double units) {
        this.units = Math.max(0, units);
    }

    public double getUnits() {
        return units;
    }

    public void setUnits(double units) {
        if (units >= 0) this.units = units;
    }

    public abstract String getSourceName();
}

