import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;
    private Plane plane;
    private Flight flight;

    @Before
    public void before() {
        pilot = new Pilot("Paul", Rank.CAPTAIN, "ABC123");
    }

    @Test
    public void pilotHasLicenseNumber() {
        assertEquals("ABC123", pilot.getLicenseNumber());
    }

    @Test
    public void pilotCanFlyPlane() {
        plane = new Plane("BOING100", 5, 1000);
        pilot = new Pilot("Paul", Rank.CAPTAIN, "ABC123");
        flight = new Flight(plane, "AA100", Airport.GLA, Airport.ORD, "12:00");
        flight.addPilot(pilot);
        assertEquals("Attention passengers, this is your captain speaking. We are now at our cruising altitude of 50 meters", pilot.flyPlane(flight));
    }

    @Test
    public void pilotCannotFlyPlane() {
        plane = new Plane("BOING100", 5, 1000);
        flight = new Flight(plane, "AA100", Airport.GLA, Airport.ORD, "12:00");
        assertEquals("You need a pilot to fly this plane!", pilot.flyPlane(flight));
    }

}
