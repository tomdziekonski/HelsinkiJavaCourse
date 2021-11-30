package domain;

import java.util.ArrayList;

public class Flight {

    private String AirplaneID;
    private String departure;
    private String target;
    private Airplane plane;
    private ArrayList<Flight> flights = new ArrayList<>();

    public Flight(Airplane plane, String departure, String target) {
        this.plane = plane;
        this.departure = departure;
        this.target = target;
    }

    public String getAirplaneID() {
        return this.AirplaneID;
    }

    public String getDeparture() {
        return this.departure;
    }

    public String getTarget() {
        return this.target;
    }
    
    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    @Override
    public String toString() {
        return plane.toString() + " (" + this.departure + "-" + this.target + ")";
    }
}
