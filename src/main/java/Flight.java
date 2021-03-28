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

    public Flight(Plane plane, String flightNumber, Airport departingFrom, Airport destination,String departureTime) {
        this.plane = plane;
        this.pilots = new ArrayList<>();
        this.cabinCrewmembers = new ArrayList<>();
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

    public int numberOfPilots() {
        return this.pilots.size();
    }

    public void addPilot(Pilot pilotToAdd) {
        if (this.remainingSpotsOnPlane() > 0) {
            this.pilots.add(pilotToAdd);
        }
    }

    public void removePilot(Pilot pilotToRemove) {
        this.pilots.remove(pilotToRemove);
    }

    public ArrayList<CabinCrewmember> getCabinCrewmembers() {
        return cabinCrewmembers;
    }

    public int numberOfCrewmembers() {
        return this.cabinCrewmembers.size();
    }

    public void addCrewmember(CabinCrewmember newCrewmember) {
        if (this.remainingSpotsOnPlane() > 0) {
            this.cabinCrewmembers.add(newCrewmember);
        }
    }

    public void removeCrewmember(CabinCrewmember crewmemberToRemove) {
        this.cabinCrewmembers.remove(crewmemberToRemove);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int numberOfPassengers() {
        return this.passengers.size();
    }

    public void addPassenger(Passenger passengerToAdd) {
        if (this.remainingSpotsOnPlane() > 0) {
            this.passengers.add(passengerToAdd);
        }
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

    public int numberOfPeopleOnFlight() {
        return numberOfPilots() + numberOfCrewmembers() + numberOfPassengers();
    }

    public int remainingSpotsOnPlane() {
        return plane.getCapacity() - numberOfPeopleOnFlight();
    }


}
