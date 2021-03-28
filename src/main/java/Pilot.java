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

    public String flyPlane() {
        return "Attention passengers, this is your captain speaking. We are now at our cruising altitude of 50 meters";
    }

}
