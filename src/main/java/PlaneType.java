public enum PlaneType {
    BOEING747(10, 100);

    private int capacity;
    private int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;

    }

    public int getTotalWeight(){
        return this.totalWeight;
    }

    public int getCapacity(){
        return this.capacity;
    }




}


