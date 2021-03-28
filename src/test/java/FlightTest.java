import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane;
    private Pilot pilot1;
    private Pilot pilot2;
    private CabinCrewmember crewmember1;
    private CabinCrewmember crewmember2;
    private Passenger passenger1;
    private Passenger passenger2;
    private Flight flight;

    @Before
    public void before() {
        plane = new Plane("BOING100", 5, 1000);
        pilot1 = new Pilot("Paul", Rank.CAPTAIN, "ABC123");
        pilot2 = new Pilot("Paulina", Rank.CAPTAIN, "XYZ789");
        crewmember1 = new CabinCrewmember("Coraline", Rank.FLIGHTATTENDANT);
        crewmember2 = new CabinCrewmember("Chris", Rank.FIRSTOFFICER);
        passenger1 = new Passenger("Phil", 2);
        passenger2 = new Passenger("Patrick", 1);
        flight = new Flight(plane, "AA100", Airport.GLA, Airport.ORD, "12:00");
        flight.addPilot(pilot1);
        flight.addCrewmember(crewmember1);
    }

    @Test
    public void flightHasPilot() {
        assertEquals(1, flight.numberOfPilots());
    }

    @Test
    public void flightHasCrewmember() {
        assertEquals(1, flight.numberOfCrewmembers());
    }

    @Test
    public void startsWithNoPassengers() {
        assertEquals(0, flight.numberOfPassengers());
    }

    @Test
    public void canAddPilotAndCrewmemberAndPassenger() {
        flight.addPilot(pilot2);
        flight.addCrewmember(crewmember2);
        flight.addPassenger(passenger1);
        assertEquals(5, flight.numberOfPeopleOnFlight());
    }

    @Test
    public void willNotOverBook() {
        flight.addPilot(pilot2);
        flight.addCrewmember(crewmember2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(5, flight.numberOfPeopleOnFlight());
    }

    @Test
    public void canRemovePilotCrewmemberPassenger() {
        flight.addPassenger(passenger1);
        flight.removePassenger(passenger1);
        flight.removeCrewmember(crewmember1);
        flight.removePilot(pilot1);
        assertEquals(0, flight.numberOfPeopleOnFlight());
    }

}
