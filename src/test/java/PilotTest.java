import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Paul", Rank.CAPTAIN, "ABC123");
    }

    @Test
    public void pilotHasLicenseNumber() {
        assertEquals("ABC123", pilot.getLicenseNumber());
    }

}
