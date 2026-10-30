package farming;

import java.util.Scanner;
import main.CityService;

public class SmartFarm extends CityService {

    private final Scanner in = new Scanner(System.in);
    private int moisture = 35;

    public SmartFarm() {
        super("Smart Farming & Irrigation");
    }

    @Override
    public void runService() {
        heading();
        System.out.println("Soil moisture: " + moisture + "%");
        System.out.print("Water amount in litres (0-100): ");
        try {
            int n = Integer.parseInt(in.nextLine());
            irrigate(n);
            System.out.println("Irrigation complete. Moisture: " + moisture + "%");
        } catch (NumberFormatException e) {
            System.out.println("Enter a whole number.");
        } catch (InvalidWaterAmountException e) {
            System.out.println(e.getMessage());
        }
    }

    public void irrigate(int litres) throws InvalidWaterAmountException {
        if (litres < 0 || litres > 100)
            throw new InvalidWaterAmountException("Water must be between 0 and 100 litres.");
        moisture = Math.min(100, moisture + litres / 2);
    }
}
