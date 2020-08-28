import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane assignedPlane;
    private String flightNum;
    private String destination;
    private String departureLocation;
    private String departureTime;

    public Flight(Plane assignedPlane,
                  String flightNum,
                  String destination,
                  String departureLocation,
                  String departureTime)
    {
        this.passengers = new ArrayList<Passenger>();
        this.assignedPlane = assignedPlane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.departureTime = departureTime;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getAssignedPlane() {
        return assignedPlane;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void bookPassenger(Passenger passenger) {
        if (assignedPlane.getType().getSeats() > this.passengers.size()) {
            this.passengers.add(passenger);
        }
    }
}
