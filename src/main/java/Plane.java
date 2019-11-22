public class Plane {

    private PlaneType planeType;

    public Plane(PlaneType planeType){
        this.planeType = planeType;
    }

    public int getWeight() {
        return this.planeType.getTotalWeight();
    }

    public int getCapacity() {
        return this.planeType.getCapacity();
    }
}
