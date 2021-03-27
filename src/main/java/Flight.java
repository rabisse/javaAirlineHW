import java.lang.reflect.Array;
import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewmember> cabinCrewmembers;
    private ArrayList<Passenger> passengers;
    private String flightNumber;
    private Airport departingFrom;
    private Airport destination;
    private String departureTime;

    public Flight(Plane plane, ArrayList<Pilot> pilots, ArrayList<CabinCrewmember> cabinCrewmembers, String flightNumber, Airport departingFrom, Airport destination,String departureTime) {
        this.plane = plane;
        this.pilots = pilots;
        this.cabinCrewmembers = cabinCrewmembers;
        this.passengers = new ArrayList<>();
        this.flightNumber = flightNumber;
        this.departingFrom = departingFrom;
        this.destination = destination;
        this.departureTime = departureTime;
    }


    public Plane getPlane() {
        return plane;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public void addPilot(Pilot pilotToAdd) {
        this.pilots.add(pilotToAdd);
    }

    public void removePilot(Pilot pilotToRemove) {
        this.pilots.remove(pilotToRemove);
    }

    public ArrayList<CabinCrewmember> getCabinCrewmembers() {
        return cabinCrewmembers;
    }

    public void addCrewmember(CabinCrewmember newCrewmember) {
        this.cabinCrewmembers.add(newCrewmember);
    }

    public void removeCrewmember(CabinCrewmember crewmemberToRemove) {
        this.cabinCrewmembers.remove(crewmemberToRemove);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passengerToAdd) {
        this.passengers.add(passengerToAdd);
    }

    public void removePassenger(Passenger passengerToRemove) {
        this.passengers.remove(passengerToRemove);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public Airport getDepartingFrom() {
        return departingFrom;
    }

    public Airport getDestination() {
        return destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }



}
