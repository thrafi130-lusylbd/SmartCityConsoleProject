package emergency;

public abstract class Emergency {

    private final String location;

    public Emergency(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public abstract String response();
}
