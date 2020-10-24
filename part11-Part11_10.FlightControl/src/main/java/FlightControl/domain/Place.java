
package FlightControl.domain;


public class Place {
    private String airportID;
    
    public Place(String airportID) {
        this.airportID = airportID;
    }
    
    @Override
    public String toString() {
        return this.airportID;
    }
}
