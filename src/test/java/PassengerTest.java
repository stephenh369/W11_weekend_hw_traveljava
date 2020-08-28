import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void before() {
        passenger1 = new Passenger("Joe Bloggs", 5);
        passenger2 = new Passenger("Boe Jloggs", 10);
    }

    @Test
    public void canGetName() {
        assertEquals("Joe Bloggs", passenger1.getName());
    }

    @Test
    public void canGetBags() {
        assertEquals(10, passenger2.getBagWeight());
    }
}
