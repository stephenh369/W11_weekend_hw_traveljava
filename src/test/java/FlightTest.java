import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger1;
    Passenger passenger2;
    ArrayList<Passenger> passengerGroup;
    Plane plane;
    Flight flight1;

    @Before
    public void before() {
        passenger1 = new Passenger("Joe Bloggs", 5);
        passenger2 = new Passenger("Boe Jloggs", 10);
        passengerGroup = new ArrayList<Passenger>();
        passengerGroup.add(passenger1);
        passengerGroup.add(passenger2);

        plane = new Plane(PlaneType.BOEING747);

        flight1 = new Flight(
                plane,
                "AB123",
                "LAX",
                "EDI",
                "0700"
        );
    }

    @Test
    public void canGetFlightNum() {
        assertEquals("AB123", flight1.getFlightNum());
    }

    @Test
    public void canGetDestination() {
        assertEquals("LAX", flight1.getDestination());
    }

    @Test
    public void canGetDepartureLocation() {
        assertEquals("EDI", flight1.getDepartureLocation());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals("0700", flight1.getDepartureTime());
    }
}
