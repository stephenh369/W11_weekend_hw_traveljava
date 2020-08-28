import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane1;
    Plane plane2;
    Plane plane3;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.AIRBUSA350);
        plane3 = new Plane(PlaneType.EMPTYPLANE);
    }

    @Test
    public void canGetType() {
        assertEquals(PlaneType.BOEING747, plane1.getType());
    }

    @Test
    public void canGetTotalWeight() {
        assertEquals(450, plane1.getType().getWeight());
    }

    @Test
    public void canGetTotalSeats() {
        assertEquals(350, plane2.getType().getSeats());
    }
}
