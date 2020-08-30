public enum PlaneType {
    BOEING747(20000, 400),
    AIRBUSA350(10000, 250),
    EMPTYPLANE(0, 0),
    SMALLPLANE(100, 10);

    private final int storageWeight;
    private final int seats;

    PlaneType(int storageWeight, int seats) {
        this.storageWeight = storageWeight;
        this.seats = seats;
    }

    public int getWeight() {
        return storageWeight;
    }

    public int getSeats() {
        return seats;
    }
}
