public class Pilot extends Person {

    private Rank rank;
    private String licenseNumber;

    public Pilot(String name, Rank rank, String licenseNumber) {
        super(name);
        this.rank = rank;
        this.licenseNumber = licenseNumber;
    }

    public Rank getRank() {
        return rank;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String flyPlane(Flight flight) {
        if (flight.numberOfPilots() != 0) {
        return "Attention passengers, this is your captain " + this.getName() + " speaking. We are now at our cruising altitude of 50 meters";
        }
        return "You need a pilot to fly this plane!";
    }

}
