import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Passenger passenger1;
    Passenger passenger2;
    ArrayList<Passenger> passengerGroup;
    Plane plane;
    Plane emptyPlane;
    Flight flight1;
    Flight emptyFlight;
    FlightManager flightManager1;

    @Before
    public void before() {
        passenger1 = new Passenger("Joe Bloggs", 5);
        passenger2 = new Passenger("Boe Jloggs", 10);
        passengerGroup = new ArrayList<Passenger>();
        passengerGroup.add(passenger1);
        passengerGroup.add(passenger2);

        plane = new Plane(PlaneType.BOEING747);
        emptyPlane = new Plane(PlaneType.EMPTYPLANE);

        flight1 = new Flight(
                plane,
                "AB123",
                "LAX",
                "EDI",
                2020,
                10,
                2,
                07,
                00
        );



        emptyFlight = new Flight(
                emptyPlane,
                "00000",
                "N/A",
                "N/A",
                2020,
                1,
                1,
                0,
                0
        );

        flightManager1 = new FlightManager(flight1);

    }

//    FLIGHT CLASS

    @Test
    public void canGetAssignedPlane() {
        assertEquals(plane, flight1.getAssignedPlane());
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
        assertEquals("0700, 02 Oct 2020", flight1.getFormattedDepartureTime());
    }

    @Test
    public void canBookPassenger() {
        flight1.bookPassenger(passenger1);
        assertEquals(1, flight1.getPassengers().size());
    }

    @Test
    public void cannotBookPassengerIfNoSeats() {
        emptyFlight.bookPassenger(passenger1);
        assertEquals(0, flight1.getPassengers().size());
    }

    @Test
    public void canGetSeatsAvailable() {
        flight1.bookPassenger(passenger1);
        assertEquals(399, flight1.seatsAvailable());
    }

//    FLIGHT MANAGER CLASS

    @Test
    public void canCalculateMaxIndividualBagWeight() {
        assertEquals(25.00, flightManager1.calculateMaxIndividualBagWeight(), 0.01);
    }

    @Test
    public void canCalculateBagWeightBooked() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        assertEquals(15.00, flightManager1.calculateBagWeightBooked(), 0.01);
    }

    @Test
    public void canCalculateBagWeightAvailable() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger2);
        assertEquals(9985.00, flightManager1.calculateBagWeightAvailable(), 0.01);
    }
}
