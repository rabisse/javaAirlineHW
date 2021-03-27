public class CabinCrewmember extends Person {

    private Rank rank;

    public CabinCrewmember(String name, Rank rank) {
        super(name);
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }


}
