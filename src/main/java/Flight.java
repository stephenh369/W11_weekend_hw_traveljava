import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Random;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane assignedPlane;
    private String flightNum;
    private String destination;
    private String departureLocation;
    private ZonedDateTime departureTime;

    public Flight(Plane assignedPlane,
                  String flightNum,
                  String destination,
                  String departureLocation,
                  int departYear,
                  int departMonth,
                  int departDay,
                  int departHour,
                  int departMin)
    {
        this.passengers = new ArrayList<Passenger>();
        this.assignedPlane = assignedPlane;
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureLocation = departureLocation;
        this.departureTime = ZonedDateTime.of(
                departYear, departMonth, departDay,
                departHour, departMin, 0, 0,
                ZoneId.of("Europe/London"));
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

    public ZonedDateTime getDepartureTime() {
        return departureTime;
    }

    public String getFormattedDepartureTime() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HHmm, dd MMM yyyy");
        String formatted = format.format(this.departureTime);
        return formatted;
    }

    public void addPassenger(Passenger passenger) {
        if (assignedPlane.getType().getSeats() > this.passengers.size()) {
            this.passengers.add(passenger);
        }
    }

    public int seatsAvailable() {
        return assignedPlane.getType().getSeats() - this.passengers.size();
    }

    public int randomAvailableSeat() {
        Random random = new Random();
        return random.ints(1, seatsAvailable()).findFirst().getAsInt();
    }
}
