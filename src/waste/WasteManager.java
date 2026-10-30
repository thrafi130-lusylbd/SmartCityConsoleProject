package waste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import main.CityService;

public class WasteManager extends CityService {

    private final List<Waste> items = new ArrayList<>();
    private final Scanner in = new Scanner(System.in);

    public WasteManager() {
        super("Waste Management");
    }

    @Override
    public void runService() {
        heading();
        System.out.println("1. Add organic\n2. Add recyclable\n3. Process collected waste");
        System.out.print("Choose: ");
        try {
            int c = Integer.parseInt(in.nextLine());
            if (c == 1 || c == 2) {
                System.out.print("Weight in kg: ");
                double kg = Double.parseDouble(in.nextLine());
                if (kg <= 0) { System.out.println("Weight must be positive."); return; }
                if (items.size() >= 20) throw new WasteOverflowException("Waste storage is full.");
                items.add(c == 1 ? new OrganicWaste(kg) : new RecyclableWaste(kg));
                System.out.println("Waste added.");
            } else if (c == 3) {
                if (items.isEmpty()) {
                    System.out.println("No waste collected.");
                } else {
                    for (Waste w : items)
                        System.out.println(w.getType() + " " + w.getKg() + " kg: " + w.process());
                    items.clear();
                }
            } else {
                System.out.println("Invalid choice.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number.");
        } catch (WasteOverflowException e) {
            System.out.println(e.getMessage());
        }
    }
}
