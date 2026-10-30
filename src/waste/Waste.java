package waste;

public abstract class Waste {

    private final String type;
    private final double kg;

    public Waste(String type, double kg) {
        this.type = type;
        this.kg = Math.max(0, kg);
    }

    public String getType() { return type; }
    public double getKg()   { return kg; }

    public abstract String process();
}
