package emergency;

import java.util.Scanner;
import main.CityService;

public class EmergencyManager extends CityService {

    private final Scanner in = new Scanner(System.in);

    public EmergencyManager() {
        super("Emergency Response");
    }

    @Override
    public void runService() {
        heading();
        System.out.println("1. Fire\n2. Medical\n3. Road accident");
        System.out.print("Emergency type: ");
        try {
            int c = Integer.parseInt(in.nextLine());
            System.out.print("Location: ");
            String loc = in.nextLine().trim();
            if (loc.isEmpty()) { System.out.println("Location cannot be empty."); return; }

            Emergency e;
            if      (c == 1) e = new FireEmergency(loc);
            else if (c == 2) e = new MedicalEmergency(loc);
            else if (c == 3) e = new AccidentEmergency(loc);
            else { System.out.println("Invalid type."); return; }

            Thread t = new Thread(() -> System.out.println(e.response() + " at " + e.getLocation() + "."));
            t.start();
            t.join(1700);
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid number.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Response interrupted.");
        }
    }
}
