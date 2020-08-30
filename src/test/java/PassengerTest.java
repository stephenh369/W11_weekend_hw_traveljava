import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Plane plane;
    Flight flight;

    @Before
    public void before() {
        passenger1 = new Passenger("Joe Bloggs", 5);
        passenger2 = new Passenger("Boe Jloggs", 10);
        plane = new Plane(PlaneType.AIRBUSA350);
        flight = new Flight(
                plane,
                "AB12345",
                "LHR",
                "GLA",
                2020,
                9,
                1,
                9, 30);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe Bloggs", passenger1.getName());
    }

    @Test
    public void canGetBags() {
        assertEquals(10, passenger2.getBagWeight());
    }


    @Test
    public void canSetFlight() {
        passenger1.setFlight(flight);
        assertEquals(flight, passenger1.getFlight());
    }

}
