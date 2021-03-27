import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane("BOING100", 4);
    }

    @Test
    public void hasPlaneModel() {
        assertEquals("BOING100", plane.getPlaneModel());
    }

    @Test
    public void hasCapacity() {
        assertEquals(4, plane.getCapacity());
    }

}
