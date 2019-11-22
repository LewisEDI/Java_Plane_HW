import java.util.ArrayList;

public class Flight {

    private String planeName;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Plane plane;


    public Flight(Plane plane, String planeName, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.planeName = planeName;
        this.passengers = new ArrayList<Passenger>();
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public String getPlaneName() {
        return this.planeName;
    }

    public int checkPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if(checkForSeat())
        this.passengers.add(passenger);
    }

    public boolean checkForSeat() {
        if (this.passengers.size() < plane.getCapacity()) {
            return true;
        }
       return false;
    }


}

