package energy;

import java.util.Scanner;
import main.CityService;

public class EnergySystem extends CityService {

    private final Scanner in = new Scanner(System.in);
    private final SolarEnergy solar = new SolarEnergy(120.5);
    private final WindEnergy wind = new WindEnergy(80.0);

    public EnergySystem() {
        super("Energy Management");
    }

    @Override
    public void runService() {
        heading();
        System.out.println("Solar: " + solar.getUnits() + " units | Wind: " + wind.getUnits() + " units");
        System.out.print("Enter city demand (units): ");
        try {
            double demand = Double.parseDouble(in.nextLine());
            if (demand < 0) throw new IllegalArgumentException("Demand cannot be negative.");
            double total = solar.getUnits() + wind.getUnits();
            if (demand <= total) {
                System.out.println("Demand met. Remaining: " + (total - demand) + " units");
            } else {
                System.out.println("Energy shortage: " + (demand - total) + " units");
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
