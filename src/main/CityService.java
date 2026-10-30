package main;
public abstract class CityService {
    private final String name;
    public CityService(String name) { this.name = name; }
    public String getName() { return name; }
    public void heading() { System.out.println("\n--- " + name + " ---"); }
    public abstract void runService();
}
