import org.junit.Before;

import java.util.ArrayList;

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
}
