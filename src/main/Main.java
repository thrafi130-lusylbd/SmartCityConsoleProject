package main;
import java.util.Scanner;
import energy.EnergySystem; import farming.SmartFarm; import waste.WasteManager;
import weather.WeatherMonitor; import drone.DroneManager; import home.SmartHome; import emergency.EmergencyManager;
public class Main {
 private static final Scanner in = new Scanner(System.in);
 public static void main(String[] args) {
  System.out.println("=== SMART CITY MANAGEMENT SYSTEM ===");
  if (!login()) { System.out.println("Login failed. Program closed."); return; }
  int choice=0;
  do {
   System.out.println("\n1. Energy Management\n2. Smart Farming & Irrigation\n3. Waste Management\n4. Weather Monitoring\n5. Drone Fleet Management\n6. Smart Home Automation\n7. Emergency Response\n8. Exit");
   try {
    System.out.print("Enter choice: "); choice=Integer.parseInt(in.nextLine().trim());
    switch(choice) {
     case 1: new EnergySystem().runService(); break;
     case 2: new SmartFarm().runService(); break;
     case 3: new WasteManager().runService(); break;
     case 4: new WeatherMonitor().runService(); break;
     case 5: new DroneManager().runService(); break;
     case 6: new SmartHome().runService(); break;
     case 7: new EmergencyManager().runService(); break;
     case 8: System.out.println("Thank you!"); break;
     default: throw new InvalidChoiceException("Choose 1-8 only.");
    }
   } catch(NumberFormatException e) { System.out.println("Please enter a number."); }
     catch(InvalidChoiceException e) { System.out.println("Error: " + e.getMessage()); }
     catch(Exception e) { System.out.println("Operation issue: " + e.getMessage()); }
  } while(choice!=8);
 }
 private static boolean login() {
  for(int i=1;i<=3;i++) {
   System.out.print("Username: "); String u=in.nextLine();
   System.out.print("Password: "); String p=in.nextLine();
   if(u.equals("admin") && p.equals("1234")) { System.out.println("Login successful!"); return true; }
   System.out.println("Wrong credentials. Attempts left: "+(3-i));
  } return false;
 }
}
