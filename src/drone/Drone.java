package drone;

public abstract class Drone extends Thread {

    private final String id;

    public Drone(String id) {
        this.id = id;
    }

    public String getIdCode() {
        return id;
    }

    public abstract String performTask();

    @Override
    public void run() {
        System.out.println(id + ": " + performTask());
    }
}
