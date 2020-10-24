
package FlightControl.ui;
import java.util.Scanner;
import FlightControl.logic.*;

public class TextUI {
    private Scanner scanner;
    private FlightControl flightControl;
    
    public TextUI() {
        this.scanner = new Scanner(System.in);
        this.flightControl = new FlightControl();
    }
    
    public void start() {
        startAssetControl();
        startFlightControl();
    }
    
    public void startAssetControl() {
        // User interface for asset data entry
        while (true) {
            System.out.println("Airport Asset Control\n"
                    + "[1] Add an airplane\n"
                    + "[2] Add a flight\n"
                    + "[x] Exit Airport Asset Control");
            String command = this.scanner.nextLine();
            
            // Exit upon input of x
            if (command.equals("x")) {
                break;
            }
            
            // Add airplane
            if (command.equals("1")) {
                System.out.print("Give the airplane id: ");
                String id = this.scanner.nextLine();                
                System.out.print("Give the airplane capacity: ");
                int capacity = Integer.valueOf(this.scanner.nextLine());
                
                this.flightControl.addAirplane(id, capacity);
                continue;
            }
            
            // Add flight

            if (command.equals("2")) {
                System.out.print("Give the airplane id: ");
                String airplaneID = this.scanner.nextLine();
                System.out.print("Give the departure airport id: ");
                String departureAirportID = this.scanner.nextLine();
                System.out.print("Give the target airport id: ");
                String targetAirportID = this.scanner.nextLine();
                
                this.flightControl.addFlight(airplaneID, departureAirportID,
                        targetAirportID);                
            }            
        }
    }
    
    public void startFlightControl() {
        // User interface for printing asset information
        while (true) {
            System.out.println("Flight Control\n"
                    + "[1] Print airplanes\n"
                    + "[2] Print flights\n"
                    + "[3] Print airplane details\n"
                    + "[x] Quit");
            String command = this.scanner.nextLine();
            
            // Print all airplanes
            if (command.equals("1")) {
                this.flightControl.printAirplanes();
                continue;
            }
            
            // Print all flights
            if (command.equals("2")) {
                this.flightControl.printFlights();
                continue;
            }
            
            // Print selected airplane
            if (command.equals("3")) {
                System.out.print("Give the airplane id: ");
                String airplaneID = this.scanner.nextLine();
                
                this.flightControl.printAirplane(airplaneID);
            }
            
            // Exit
            if (command.equals("x")) {
                break;
            }
        }
    }
}
