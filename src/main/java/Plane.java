public class Plane {

    private String planeModel;
    private int capacity;
    private int totalWeight;

    public Plane(String planeModel, int capacity, int totalWeight) {
        this.planeModel = planeModel;
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public String getPlaneModel() {
        return planeModel;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

}
