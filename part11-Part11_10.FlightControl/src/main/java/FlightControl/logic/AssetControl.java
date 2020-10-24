package FlightControl.logic;

import FlightControl.domain.*;
import java.util.*;

public class AssetControl {

    private HashMap<String, Airplane> airplanes;
    private HashSet<Flight> flights;

    public AssetControl() {
        this.airplanes = new HashMap<>();
        this.flights = new HashSet<>();
    }

    public void addAirplane(String airplaneID, int capacity) {
        this.airplanes.put(airplaneID, new Airplane(airplaneID, capacity));
    }

    public void addFlight(String airplaneID, String departureAirport,
            String targetAirport) {
        
        this.flights.add(new Flight(this.airplanes.get(airplaneID), 
                new Place(departureAirport), new Place(targetAirport)));        
    }
    
    // Print all airplanes
    public void printAirplanes() {
        for (Airplane plane : this.airplanes.values()) {
            System.out.println(plane);
        }
    }
    
    // Print airplane with specified ID
    public void printAirplane(String airplaneID) {
        System.out.println(this.airplanes.get(airplaneID));
    }
    
    // Print all flights
    public void printFlights() {
        for (Flight flight : this.flights) {
            System.out.println(flight);
        }
    }
}
